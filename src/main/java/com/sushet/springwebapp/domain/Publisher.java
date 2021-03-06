package com.sushet.springwebapp.domain;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Publisher {

    private String name;
    private String addressLine1;
    private String city;
    private String state;

    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private Long id;

    public Publisher(String name, String addressLine1, String city, String state) {
        this.name = name;
        this.addressLine1 = addressLine1;
        this.city = city;
        this.state = state;
    }
    public Publisher()
    {}
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

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
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

    @Override
    public String toString() {
        return "Publisher{" +
                "name='" + name + '\'' +
                ", addressLine1='" + addressLine1 + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Publisher publisher = (Publisher) o;
        return Objects.equals(name, publisher.name) &&
                Objects.equals(addressLine1, publisher.addressLine1) &&
                Objects.equals(city, publisher.city) &&
                Objects.equals(state, publisher.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, addressLine1, city, state);
    }



}
