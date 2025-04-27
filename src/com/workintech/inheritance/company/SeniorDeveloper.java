package com.workintech.inheritance.company;

public class SeniorDeveloper extends Employee {

    public SeniorDeveloper(long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        setSalary(50000);
        System.out.println(getId() + " senior developer is in meeting");
    }
}
