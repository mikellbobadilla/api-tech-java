package com.mikellbobadilla.tech.models;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;

    @Column(name = "last_name")
    private String lastName;

    private Byte age;

    private String email;

    private String role;

    private String password;

    private String charge;


    public UserModel() {}

    public UserModel(Long id, String name, String lastName, Byte age, String email, String role, String password, String charge) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.role = role;
        this.password = password;
        this.charge = charge;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCharge() {
        return charge;
    }

    public void setCharge(String charge) {
        this.charge = charge;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", role='" + role + '\'' +
                ", password='" + password + '\'' +
                ", charge='" + charge + '\'' +
                '}';
    }
}
