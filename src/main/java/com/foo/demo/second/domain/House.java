package com.foo.demo.second.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class House {
    @Id
    Long id;
    String address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
