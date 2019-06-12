package gLibrary.config;

import javax.sql.DataSource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@MapperScan(basePackages="gLibrary.dataaccess.mapper")
public class MyBatisConfig {
	@Autowired
	DataSource dataSource;

	/*@Bean
	public SqlSessionFactoryBean sqlSessionFactory()
			throws Exception {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(dataSource);
		sqlSessionFactoryBean.setConfigLocation(new ClassPathResource("application.properties"));
		sqlSessionFactoryBean.setMapperLocations(
				new Resource[]{new ClassPathResource("src/main/resources/gLibrary/dataaccess/mapper/departmentmapper.xml")}
				);
		return sqlSessionFactoryBean;
	}*/

	@Bean
	public PlatformTransactionManager transactionManager() {
		return new DataSourceTransactionManager(dataSource);
	}
}
