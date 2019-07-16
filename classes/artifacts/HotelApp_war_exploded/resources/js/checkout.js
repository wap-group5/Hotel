$(function() {
    $('#btn_add').click(chargeCustomer);

    function chargeCustomer() {
        // language=JQuery-CSS
        var guestId = $('#guest_id').val();
        var rentBill = $('#rent_Bill').val();
        var  billingInfo= {id: guestId, bill: rentBill};
        $.post('checkout',{billingInfo: JSON.stringify(billingInfo)}).always(processData);

    }

    function processData(data){
        window.location.href = "login" ;
    }
});