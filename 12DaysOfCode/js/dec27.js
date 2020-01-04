let songName = document.getElementById("input");
let url = document.getElementById("urlInput");
let artist = document.getElementById("artist");
let increment = () => {
    return ($('tr').last().children('th').valueOf()) + 1;
}

$(document).ready(function () {

    $("#btn").click(function () {
        event.preventDefault();
       $("ul").append("<li><a href='" + url.value + "'>" + input.value + "</a></li>");
    });

    // $("#btn").click(function () {
    //     event.preventDefault();
    //     $("table").append(
    //         "<tr> <th></th> <th><a href=" + url + ">" + songName + "</a></th> <th>" + artist + "</th> </tr>");
    // });



});

