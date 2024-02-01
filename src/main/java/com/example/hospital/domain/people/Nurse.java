package com.example.hospital.domain.people;

import com.example.hospital.domain.buildings.Room;


import java.util.List;


public class Nurse extends Employee{

    private List<Operations> operations;

    private Room room;

    public List<Operations> getOperations() {
        return operations;
    }

    public void setOperations(List<Operations> operations) {
        this.operations = operations;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "Nurse{" +
                "operations=" + operations +
                ", room=" + room +
                '}';
    }
}
