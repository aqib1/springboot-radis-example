package com.radis.io.entities;


import java.io.Serializable;

public class UserEntity implements Serializable {

    private Long id;
    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
