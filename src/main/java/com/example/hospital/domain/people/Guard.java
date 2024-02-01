package com.example.hospital.domain.people;

public class Guard extends Employee{

    private String weapon;

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Guard{" +
                "weapon='" + weapon + '\'' +
                '}';
    }
}
