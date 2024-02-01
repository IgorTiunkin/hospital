package com.example.hospital.domain.people;

import java.util.List;

public class Manager extends Employee{

    private List<Operations> operations;

    private List <Employee> subordinates;

    private Long bonuses;

    public List<Operations> getOperations() {
        return operations;
    }

    public void setOperations(List<Operations> operations) {
        this.operations = operations;
    }

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
                "operations=" + operations +
                ", subordinates=" + subordinates +
                ", bonuses=" + bonuses +
                '}';
    }
}
