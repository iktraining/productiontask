
new Vue({
		el: '#menu-button',
		data: {
			isActive: false
		}
	})

$(document).ready(function() {
  // Check for click events on the navbar burger icon
  $(".navbar-burger").click(function() {
      // Toggle the "is-active" class on both the "navbar-burger" and the "navbar-menu"
      $(".navbar-burger").toggleClass("is-active");
      $(".navbar-menu").toggleClass("is-active");

  });
});



var bookinfo = new Vue({
    el: '#bookinfo',
    data() {
        return {
        element:  {
            "onix": {
                "DescriptiveDetail": {
                  "TitleDetail": {
                    "TitleElement": {
                      "TitleText": {
                        "collationkey": ""
                      }
                    }
                  },
                },
                "CollateralDetail": {
                  "TextContent": [
                    {
                      "Text": ""
                    }
                  ]
                }
              },
              "summary": {
                "isbn": "",
                "title": "",
                "publisher": "",
                "pubdate": "",
                "cover": "",
                "author": ""
              }
            },
        publicationYear: "",
        publicationMonth: ""
        }
    }
});

var isbn = new Vue({
    el: '#isbnInput',
    data: {
            isbn: '',
            message: ""
    },
    methods: {
        getIsbn: function(){
            console.log(this.isbn);
            return this.isbn;

        },
        getBookInfo: function () {
            axios
            .get('https://api.openbd.jp/v1/get?isbn='+this.getIsbn())
            .then(response => {
                    if (response.data[0] == null) {
                        this.message = "本の情報を取得できませんでした";
                        return;
                    }
                    bookinfo.element = response.data[0];
                    this.dateSplit(bookinfo.element);
                }
            );

        },
        dateSplit: function(element){
            var date = element.summary.pubdate.split('-');
            bookinfo.publicationYear = date[0];
            bookinfo.publicationMonth = parseInt(date[1]);
        }

    }
});