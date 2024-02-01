package com.example.hospital.domain.buildings;

import java.util.List;


public class HospitalUnitBuilding extends Building {

    private List<Room> rooms;

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        return "HospitalUnitBuilding{" +
                "rooms=" + rooms +
                '}';
    }
}
