$(document).ready(function () {

    $.get("/users", function (data) {

        data.forEach(function (element) {
            $("#user-table tr:last")
                .after('<tr><td>' + element.id + '</td><td>' + element.name + '</td></tr>');
        });

    });

});