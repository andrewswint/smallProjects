let input = document.getElementById("form1");
let url = document.getElementById("urlInput")

$(document).ready(function () {

    $("#btn").click(function () {
       $("ul").append("<li>" + input.value + "</li>")
    });

});

