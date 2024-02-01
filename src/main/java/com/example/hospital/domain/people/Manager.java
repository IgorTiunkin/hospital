package com.example.hospital.domain.people;

import java.util.List;

public class Manager extends Employee{


    private List <Employee> subordinates;

    private Long bonuses;

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    public void setSubordinates(List<Employee> subordinates) {
        this.subordinates = subordinates;
    }

    public Long getBonuses() {
        return bonuses;
    }

    public void setBonuses(Long bonuses) {
        this.bonuses = bonuses;
    }

    @Override
    public String toString() {
        return "Manager{" +
                ", subordinates=" + subordinates +
                ", bonuses=" + bonuses +
                '}';
    }
}
