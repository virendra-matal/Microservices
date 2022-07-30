package com.contact.Model;

public class Contact {

    private int contactId;
    private String contactName;
    private String phone;
    private String nickName;
    private int userId;

    public Contact(int contactId, String contactName, String phone, String nickName, int userId) {
        this.contactId = contactId;
        this.contactName = contactName;
        this.phone = phone;
        this.nickName = nickName;
        this.userId = userId;
    }

    public Contact() {


    }

    public Contact(int contactId, String contactName, String phone, String nickName) {
        this.contactId = contactId;
        this.contactName = contactName;
        this.phone = phone;
        this.nickName = nickName;
    }

    public int getContactId() {
        return contactId;
    }

    public void setContactId(int contactId) {
        this.contactId = contactId;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "contactId=" + contactId +
                ", contactName='" + contactName + '\'' +
                ", phone='" + phone + '\'' +
                ", nickName='" + nickName + '\'' +
                ", userId=" + userId +
                '}';
    }
}
