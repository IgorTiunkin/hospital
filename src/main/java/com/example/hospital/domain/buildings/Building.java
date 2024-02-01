package com.example.hospital.domain.buildings;


import com.example.hospital.domain.Address;

import java.time.LocalDate;

public abstract class Building extends Address {

    private String title;

    private Address address;

    private LocalDate yearOfBuilding;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public LocalDate getYearOfBuilding() {
        return yearOfBuilding;
    }

    public void setYearOfBuilding(LocalDate yearOfBuilding) {
        this.yearOfBuilding = yearOfBuilding;
    }

    @Override
    public String toString() {
        return "Building{" +
                "title='" + title + '\'' +
                ", address=" + address +
                ", yearOfBuilding=" + yearOfBuilding +
                '}';
    }
}
