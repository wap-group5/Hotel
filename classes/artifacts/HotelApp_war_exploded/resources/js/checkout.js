$(function() {
    $('#btn_add').click(chargeCustomer);

    function chargeCustomer() {
        // language=JQuery-CSS
        var guestId = $('#geust_id').val();
        var rentBill = $('#rent_Bill').val();
        var  billingInfo= {id: guestId, bill: rentBill};
        $.post('checkout', {checkout: JSON.stringify(billingInfo)}, "json")
    }
});