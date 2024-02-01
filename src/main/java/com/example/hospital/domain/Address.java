package com.example.hospital.domain;


import com.example.hospital.domain.people.Person;

public class Address extends Person {

    private Long zipCode;

    private String streetName;

    private Integer buildingNumber;

    public Long getZipCode() {
        return zipCode;
    }

    public void setZipCode(Long zipCode) {
        this.zipCode = zipCode;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public Integer getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(Integer buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    @Override
    public String toString() {
        return "Address{" +
                "zipCode=" + zipCode +
                ", streetName='" + streetName + '\'' +
                ", buildingNumber=" + buildingNumber +
                '}';
    }
}
