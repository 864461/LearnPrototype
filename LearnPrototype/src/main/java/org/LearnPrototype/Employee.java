package org.LearnPrototype;

import java.io.Serializable;

public class Employee implements Serializable {
    public int salary;
    public String position;

    public Employee(int salary, String position) {
        this.salary = salary;
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", position='" + position + '\'' +
                '}';
    }
}
