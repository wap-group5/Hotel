$(function() {
    refreshTotal();

    $('#btn_add').click(chargeCustomer);
    $('#refreshTotal').click(refreshTotal);

    function chargeCustomer() {
        // language=JQuery-CSS
        var guestId = $('#guest_id').val();
        var rentBill = $('#rent_Bill').val();
        var  billingInfo= {id: guestId, bill: rentBill};
        $.post('checkout',{billingInfo: JSON.stringify(billingInfo)})
            .done(processData)
            .fail(function () {
                alert("An Error occured");
            });

    }

    function processData(jsonString){
        var data = JSON.parse(jsonString);
        if(data.success) {
            window.location.href = "login";
        }else{
            alert(data.message);
            window.location.href = "login";
        }
    }

    function refreshTotal() {
        var duration = document.getElementById('duration').value;
        var roomrate = 50;//assign static rate

        var subTotal = duration * roomrate;

        $('#subTotal').text(subTotal);

        var tax = subTotal * 0.07;
        var total = subTotal + tax;

        $('#totalPrice').text('Total (VAT 7%): USD' + total);
    }

});