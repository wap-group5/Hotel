package com.group5.model;

/**
 * This pojo Guest class will have the info
 * of Guest who is looking for reserving a room
 */
public class Guest {
    private Integer id;
    // personal details
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String socialSecurity;
    private String dateOfBirth;
    private String phoneNumber;
    private String addressLineOne;
    private String getAddressLineTwo;
    private String city;
    private String state;
    private String zipCode;
    private String country;
    // booking duration
    private String checkInTime;
    private String checkOUtTime;
    private String typeOfBedRoom;// 1_bedRoom or 2_bedRoom
    private String moreInfoTextArea;
    // payment Info
    private String paymentType;// visa , masterCard radio button
    private String cardNumber;
    private String expireDate;
    private String sCode;
    private String paymentAgreement; // radio button yes or no
    // constructor


    public Guest() {
    }
    // getters and setters pair

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getSocialSecurity() {
        return socialSecurity;
    }

    public void setSocialSecurity(String socialSecurity) {
        this.socialSecurity = socialSecurity;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddressLineOne() {
        return addressLineOne;
    }

    public void setAddressLineOne(String addressLineOne) {
        this.addressLineOne = addressLineOne;
    }

    public String getGetAddressLineTwo() {
        return getAddressLineTwo;
    }

    public void setGetAddressLineTwo(String getAddressLineTwo) {
        this.getAddressLineTwo = getAddressLineTwo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCheckInTime() {
        return checkInTime;
    }

    public void setCheckInTime(String checkInTime) {
        this.checkInTime = checkInTime;
    }

    public String getCheckOUtTime() {
        return checkOUtTime;
    }

    public void setCheckOUtTime(String checkOUtTime) {
        this.checkOUtTime = checkOUtTime;
    }

    public String getTypeOfBedRoom() {
        return typeOfBedRoom;
    }

    public void setTypeOfBedRoom(String typeOfBedRoom) {
        this.typeOfBedRoom = typeOfBedRoom;
    }

    public String getMoreInfoTextArea() {
        return moreInfoTextArea;
    }

    public void setMoreInfoTextArea(String moreInfoTextArea) {
        this.moreInfoTextArea = moreInfoTextArea;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public String getsCode() {
        return sCode;
    }

    public void setsCode(String sCode) {
        this.sCode = sCode;
    }

    public String getPaymentAgreement() {
        return paymentAgreement;
    }

    public void setPaymentAgreement(String paymentAgreement) {
        this.paymentAgreement = paymentAgreement;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    // toString


    @Override
    public String toString() {
        return "Guest{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", socialSecurity='" + socialSecurity + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", addressLineOne='" + addressLineOne + '\'' +
                ", getAddressLineTwo='" + getAddressLineTwo + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", country='" + country + '\'' +
                ", checkInTime='" + checkInTime + '\'' +
                ", checkOUtTime='" + checkOUtTime + '\'' +
                ", typeOfBedRoom='" + typeOfBedRoom + '\'' +
                ", moreInfoTextArea='" + moreInfoTextArea + '\'' +
                ", paymentType='" + paymentType + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", expireDate='" + expireDate + '\'' +
                ", sCode='" + sCode + '\'' +
                ", paymentAgreement='" + paymentAgreement + '\'' +
                '}';
    }
}


