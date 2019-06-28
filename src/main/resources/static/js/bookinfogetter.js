var isbn = new Vue({
    el: '.inputIsbn',
    data: {
            isbn: '',
            message: ""
    },
    methods: {
        getIsbn: function(){
            console.log(this.isbn);
            return this.isbn;

        }
    }
})

new Vue({
    el: '#bookinfo',
    data() {
        return {
        information: [],
        publicationYear: "",
        publicationMonth: ""
        }
    },
    methods: {
        getBookInfo: function () {
            axios
            .get('https://api.openbd.jp/v1/get?isbn='+isbn.getIsbn())
            .then(response => {
                    if (response.data[0] == null) {
                        isbn.message = "本の情報を取得できませんでした";
                        return;
                    }
                    this.information = response.data;
                    this.dateSplit(this.information);
                }
            );

        },
        dateSplit: function(information){
            var date = information[0].summary.pubdate.split('-');
            this.publicationYear = date[0];
            this.publicationMonth = date[1];
        }
    }
})
})