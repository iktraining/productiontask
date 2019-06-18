package gLibrary.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true) //メソッド単位のアクセス制御 pp.312
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
                .antMatchers("/login").permitAll()
                .antMatchers(HttpMethod.GET, "/logout").permitAll()
                //.antMatchers("/admin").hasAuthority("role_admin") // /admin配下にはロールrole_admin(大文字小文字区別あり)が設定されているユーザでログインしている場合のみアクセスできる
                .antMatchers("/index").authenticated()  //認証されているユーザであればアクセスできる
                .antMatchers("/search").authenticated()
                //.anyRequest().denyAll()//上記以外のパスには、アクセスできる
                .and()
            .formLogin() //認証方式には、フォームログイン方式を採用する
            	.loginPage("/login")//ログイン画面URL
            	.loginProcessingUrl("/login")//ログイン処理実行URL
                .defaultSuccessUrl("/index")
                .failureUrl("/login")
                .usernameParameter("userId")//リクエストパラメータ ログイン名
                .passwordParameter("password")//リクエストパラメータ パスワード
                .and()
            .logout() //ログアウト機能を有効にして、ログアウト用のURLを/logoutとし、ログアウト実施後は/indexに遷移する
                .logoutUrl("/logout")
                .logoutSuccessUrl("/login")
                .invalidateHttpSession(true)//ログアウト時のHttpSessionの無効化設定
                //.deleteCookies("JSESSIONID","OTHER1","OTHER2")//ログアウト時のCookieの削除設定
                .and()
        	//.exceptionHandling()//エラーページを指定する
        		//.accessDeniedPage("/accessDenied")
        		//.and()
            .csrf()
            	.disable();//CSRF対策は無効にする
	}

    //認証情報を認証・認可情報を保持するテーブルに接続するためのDataSourceオブジェクトを
    //@Autowiredでインジェクションする
    @Autowired
    private DataSource dataSource;

    //認証情報を取得するためのSQLを定義
    //USER_QUERYには指定したユーザの認証情報を取得するSQLを定義
    private static final String USER_QUERY
    ="SELECT user_id as UserId, password, true "
    +"FROM users.users "
    +"WHERE user_id = ?";

    //ROLES_QUERYには指定したユーザの認可情報を取得するSQLを定義
    private static final String AUTHORITY_QUERY
    ="SELECT user_id as userId, authority_code as authorityCode "
    +"FROM users.users "
    +"WHERE user_id = ?";


    //AuthenticationManager（認証処理）の設定
    //jdbcAuthentication()を実行したDBから取得するための設定を行う
    @Override
    @Autowired
    protected void configure(AuthenticationManagerBuilder auth)
            throws Exception {
        auth.jdbcAuthentication()
        	.passwordEncoder(new BCryptPasswordEncoder())//passwordの暗号化方式の指定。ここでは推奨されているBCryptを指定
        	.dataSource(dataSource)//DataSourceの設定
        	.usersByUsernameQuery(USER_QUERY)//認証情報取得SQLの設定
        	.authoritiesByUsernameQuery(AUTHORITY_QUERY);//認可情報取得SQLの設定
    }

    //@EnableGlobalMethodSecurityを設定するために下記メソッドをDIコンテナにBean定義する
    //アクセス制御したいメソッドには@PreAuthorizeを設定するpp.313
    //また、メソッドを実行した後にアクセス権を確認したい場合は@PostAuthorizeを使用する
    @Override
    @Bean
    public AuthenticationManager authenticationManagerBean()
    throws Exception{
    	return super.authenticationManagerBean();
    }
}
