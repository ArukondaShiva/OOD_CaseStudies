package org.example.useraccountcredimpl;

public class User {

    private String name;
    private String address;
    private String email;
    private String phone;
    private Integer userId;
    static Integer userCount = 1;


    public User(String name, String address, String email, String phone) {
        userId = userCount;
        userCount++;
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
    }
}
