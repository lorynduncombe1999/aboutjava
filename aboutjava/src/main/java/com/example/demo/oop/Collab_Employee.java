package com.example.demo.oop;

public class Collab_Employee {
    //class doesnt need main method, ment to reuse by other classes
    //example of encapsulation
    private int empId;
    private String firstName;
    private String  lastName;
    private boolean isActive;
    private double income;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    //generate to make object readable
    @Override
    public String toString() {
        return "Collab_Employee{" +
                "empId=" + empId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", isActive=" + isActive +
                ", income=" + income +
                '}';
    }
}
