package com.example.demo.oop;

public class ABC_Corp {
    public static void main(String[] args) {
        //main method is here create employee call getter/setters in order to work.
        Collab_Employee employeeOne = new Collab_Employee();
        employeeOne.setEmpId(101);
        employeeOne.setFirstName("Josh");
        employeeOne.setLastName("Wilson");
        employeeOne.setIncome(10100);
        employeeOne.setActive(true);

        //prints entire object
        System.out.println(employeeOne);

        //prints specific variable
        System.out.println(employeeOne.getFirstName());

        Collab_Employee employeeTwo = new Collab_Employee();
        employeeTwo.setFirstName("Mike");
        employeeTwo.setLastName("Miller");
        employeeTwo.setIncome(1200);

        //prints entire object
        System.out.println(employeeTwo);
    }
}
