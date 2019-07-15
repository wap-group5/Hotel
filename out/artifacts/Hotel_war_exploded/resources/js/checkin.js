$(function(){
    $('.checkin').click(goToRoom);
    $('.room-type').click(checkin);
    var selectedId = "";

    function goToRoom(event){
        selectedId = event.target.id;
      //  $(document).scrollTop( $("#room").offset().top );
        $(document).scrollTop( $("#room") );
    }

    function checkin(event){
        var roomType = event.target.id;
        var checkinObj = {roomType: roomType, guestId : selectedId};
        $.post("checkin",{"checkin":JSON.stringify(checkinObj)})
            .done(function (data) {
                data = JSON.parse(data);
                    if(data.success){

                    }else{

                    }})
            .fail(function () {

            })
            .always(function () {

            });
    }

});