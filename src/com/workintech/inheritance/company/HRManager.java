package com.workintech.inheritance.company;

import java.util.Arrays;

public class HRManager extends Employee {
    private JuniorDevelepor[] juniors;
    private MidDeveloper[] mids;
    private SeniorDeveloper[] seniors;

    public HRManager(long id, String name, double salary, JuniorDevelepor[] juniors, MidDeveloper[] mids, SeniorDeveloper[] seniors) {
        super(id, name, salary);
        this.juniors = juniors;
        this.mids = mids;
        this.seniors = seniors;
    }

    @Override
    public void work() {
        setSalary(2000);
        System.out.println(getName() + " hr managers sleeping.");
    }

    //TODO BUNU TEKE İNDİR
    public void addEmployee(int index, JuniorDevelepor junior) {
        try {
            if (juniors[index] == null) {
                juniors[index] = junior;
            } else {
                System.out.println("Index is full");
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
            System.out.println("Index not found: " + index);
        }
    }

    public void addEmployee(int index, MidDeveloper mid) {
        try {
            if (mids[index] == null) {
                mids[index] = mid;
            } else {
                System.out.println("Index is full");
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
            System.out.println("Index not found: " + index);
        }
    }

    public void addEmployee(int index, SeniorDeveloper senior) {
        try {
            if (seniors[index] == null) {
                seniors[index] = senior;
            } else {
                System.out.println("Index is full");
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
            System.out.println("Index not found: " + index);
        }
    }
}
