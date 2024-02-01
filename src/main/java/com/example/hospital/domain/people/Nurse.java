package com.example.hospital.domain.people;

import com.example.hospital.domain.buildings.Room;


import java.util.List;


public class Nurse extends Employee{


    private Room room;




    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "Nurse{" +
                ", room=" + room +
                '}';
    }
}
