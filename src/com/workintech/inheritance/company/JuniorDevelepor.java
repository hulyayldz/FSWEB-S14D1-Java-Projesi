package com.workintech.inheritance.company;

public class JuniorDevelepor extends Employee {
    public JuniorDevelepor(long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        setSalary(3200);
        System.out.println(getName() + "junior is working a lot");
    }
}
