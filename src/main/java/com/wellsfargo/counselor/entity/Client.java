package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Client {

    @Id
    @GeneratedValue()
    public long clientId;
    @ManyToOne
    @JoinColumn(name = "advisorId")
    private Advisor advisor;
    @Column(nullable = false)
    private  String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String email;


    public Client(String firstName, String lastName, String address, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
        this.email = email;
    }


    public long getClientId(){return clientId; }

    public String getFirstName(){return firstName; }

    public void setFirstName(String firstName){this.firstName = firstName; }

    public String getLastName(){return lastName; }

    public void setLastName(String lastName){this.lastName = lastName; }

    public String getAddress(){return address;}

    public void setAddress(String address){this.address = address; }

    public String getEmail(){return email; }


    public void setEmail(String email){ this.email = email; }

    public String getPhone(){ return phone;}

    public void setPhone(String phone){ this.phone = phone; }

}