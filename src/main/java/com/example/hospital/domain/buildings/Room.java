package com.example.hospital.domain.buildings;

import com.example.hospital.domain.people.Nurse;

public class Room {

    private Long number;

    private HospitalUnitBuilding hospitalUnitBuilding;

    private Nurse nurse;

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public HospitalUnitBuilding getHospitalUnitBuilding() {
        return hospitalUnitBuilding;
    }

    public void setHospitalUnitBuilding(HospitalUnitBuilding hospitalUnitBuilding) {
        this.hospitalUnitBuilding = hospitalUnitBuilding;
    }

    public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }

    @Override
    public String toString() {
        return "Room{" +
                "number=" + number +
                ", hospitalUnitBuilding=" + hospitalUnitBuilding +
                ", nurse=" + nurse +
                '}';
    }
}
