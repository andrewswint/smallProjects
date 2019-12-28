let input = document.getElementById("input");
let url = document.getElementById("urlInput")

$(document).ready(function () {

    $("#btn").click(function () {
        event.preventDefault();
       $("ul").append("<li><a href='" + url.value + "'>" + input.value + "</a></li>");
    });

});

