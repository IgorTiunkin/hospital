package com.example.hospital.domain.people;

import com.example.hospital.domain.people.Person;


public class Client extends Person {

    private String illness;

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    @Override
    public String toString() {
        return "Client{" +
                "illness='" + illness + '\'' +
                '}';
    }
}
