package com.example.hospital.domain.people;



import java.time.LocalDate;
import java.util.List;

public abstract class Employee extends Person{

    private Manager manager;

    private Long salary;

    private LocalDate startOfWork;

    private Long experience;

    private String workNumber;

    private List<Operations> operations;

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public LocalDate getStartOfWork() {
        return startOfWork;
    }

    public void setStartOfWork(LocalDate startOfWork) {
        this.startOfWork = startOfWork;
    }

    public Long getExperience() {
        return experience;
    }

    public void setExperience(Long experience) {
        this.experience = experience;
    }

    public String getWorkNumber() {
        return workNumber;
    }

    public void setWorkNumber(String workNumber) {
        this.workNumber = workNumber;
    }

    public List<Operations> getOperations() {
        return operations;
    }

    public void setOperations(List<Operations> operations) {
        this.operations = operations;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "manager=" + manager +
                ", salary=" + salary +
                ", startOfWork=" + startOfWork +
                ", experience=" + experience +
                ", workNumber='" + workNumber + '\'' +
                '}';
    }
}
