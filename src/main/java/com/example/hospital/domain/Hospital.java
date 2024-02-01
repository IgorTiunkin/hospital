package com.example.hospital.domain;

import com.example.hospital.domain.buildings.Building;
import com.example.hospital.domain.people.Employee;


import java.util.List;

public class Hospital extends Employee {

    private String title;

    private List <Building> buildings;

    private List <Employee> employees;

    private Long yearOfEstablishing;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Building> getBuildings() {
        return buildings;
    }

    public void setBuildings(List<Building> buildings) {
        this.buildings = buildings;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public Long getYearOfEstablishing() {
        return yearOfEstablishing;
    }

    public void setYearOfEstablishing(Long yearOfEstablishing) {
        this.yearOfEstablishing = yearOfEstablishing;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "title='" + title + '\'' +
                ", buildings=" + buildings +
                ", employees=" + employees +
                ", yearOfEstablishing=" + yearOfEstablishing +
                '}';
    }
}
