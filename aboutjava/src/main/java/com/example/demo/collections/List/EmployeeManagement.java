package com.example.demo.collections.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeManagement {
    static ArrayList<Employee> employeeList = new ArrayList<>();
    public static void main(String[] args) {
      //  System.out.println(getEmpList());

    // getEmpList().forEach(emp-> System.out.println(emp));
     getEmpList().forEach(employee -> System.out.println("Name: "+ employee.getEmpName() + "  Dept: "+ employee.getEmpDept()));

       getEmpList().sort(new Comparator<Employee>() {
           @Override
           public int compare(Employee empone, Employee emptwo) {
               if(empone.getEmpID() == emptwo.getEmpID())
                   return 0;
               else if(empone.getEmpID()>  emptwo.getEmpID())
                   return 1;
               else
                   return -1;
           }
       });
//if it is primitive data type (int) you  have ot put in  your own  logic if it is  non primative you can use the compareto mehtod
        getEmpList().sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee empone, Employee emptwo) {
                return empone.getEmpName().compareTo(emptwo.getEmpName());

            }
        });

        }

    public static ArrayList<Employee> getEmpList() {
        employeeList.add(createEmployee(101, "User One", "IT", 1200.89, true));
        employeeList.add(createEmployee(102, "User Two", "Marketing", 1300.89, false));
        employeeList.add(createEmployee(103, "User Three", "IT", 1400.89, true));
        employeeList.add(createEmployee(104, "User Four", "Software", 1100.89, false));
        employeeList.add(createEmployee(105, "User Five", "Finance", 1800.89, true));
        return employeeList;
    }
    public static Employee createEmployee
            (int id, String name, String dept, Double income,
             boolean active) {
        Employee employee = new Employee();
        employee.setEmpID(id);
        employee.setEmpName(name);
        employee.setEmpDept(dept);
        employee.setEmpIncome(income);
        employee.setActive(active);
        return employee;
    }
  /*
    1. Create set of employee (At least five)
    2. Print the emp name and dept
    3. Sort the emp by ID
    4. Sor the emp by there first name;
   */

}
