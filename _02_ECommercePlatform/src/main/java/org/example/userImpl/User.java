package org.example.userImpl;

public abstract class User {

    private int id;
    private String name;
    private String address;
    private String userName;
    private String password;
    private String phone;


    public User(String name,String phone){
        this.name = name;
        this.phone = phone;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public String getPhone(){
        return phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
