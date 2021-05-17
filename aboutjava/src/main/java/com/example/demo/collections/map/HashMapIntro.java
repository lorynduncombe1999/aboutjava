package com.example.demo.collections.map;

import com.example.demo.collections.List.Employee;

import java.util.*;


public class HashMapIntro  {
  /*
    Add five employee with same employee class
    print all  5 employee
    Print the employee  by first name
    print  the employeee by name, income,  and active status
    sort by first name
     */

    /*
    Map interface
    1. Hashmap
    2.Tree Map
    3. HashTable
    4.
     */
    static Map<Integer, Employee>  employeeMap = new HashMap<>();

    public static Map<Integer,Employee> addEmployee(){
        employeeMap.put(12,createEmployee(101, "User One", "IT", 1200.89, true));
        employeeMap.put(23,createEmployee(102, "User Two", "Marketing", 1300.89, false));
        employeeMap.put(45,createEmployee(103, "User Three", "Software", 1400.89, false));
        employeeMap.put(8,createEmployee(104, "User Four", "Finance", 1100.89, true));
        employeeMap.put(11,createEmployee(105, "User Five", "IT", 1223.89, true));
        return employeeMap;

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

    public static void printMap(Map<Integer,Employee> map){
       addEmployee().forEach((integer, employee) ->{
           System.out.println(employee.getEmpName());


        });
        }

    public static void printName(Map<Integer,Employee> map){
        System.out.println("Print By Name");

        for (Employee value : employeeMap.values()) {
            System.out.println("Value: " + value.getEmpName());
        }
    }
    public static void printIncome(Map<Integer,Employee> map){
        System.out.println("Print By Income");
        for (Employee value : employeeMap.values()) {
            System.out.println("Value: " + value.getEmpIncome());
        }

    }

    public static void printActive(Map<Integer,Employee> map){
        System.out.println("Print Active");
        for (Employee value : employeeMap.values()) {
            System.out.println("Value: " + value.getActive());
        }

    }
    public static void main(String[] args) {
        addEmployee();
        printMap(employeeMap);
        printName(employeeMap);
        printIncome(employeeMap);
        printActive(employeeMap);




        //Sort by first name
        /*    ArrayList<String> employeeByFirstName = new ArrayList<>();
            for (Employee value : employeeMap.values()) {
                employeeMap.values();
            }
        System.out.println(employeeByFirstName);
         employeeMap.sort(new Comparator<HashMap<Employee>>() {
             @Override
             public int compare( HashMap<Employee o1, HashMap<Employee> o2) {
                 o1.values().
                 return o1.values().getEmpName().compareTo(o2.values().getEmpName());
             }
         });


        System.out.println(employeeByFirstName);
*/
       // Map<Integer, String> dataList = new HashMap<>();
        //Add Data
       // dataList.put(11, "Java");
       // dataList.put(12, "JavaScript");
       // dataList.put(13, "Python");
        //dataList.put(14, "HTML");

       // System.out.println(dataList);

        //How to iterate through a map

        //prints the value of key
        //    for (Employee value : employeeMap.values()) {
        //         System.out.println("Value: " + value.getEmpName());
            }
        }

        //prints value
     //   for (String value : dataList.values()) {
          //  System.out.println("Value: " + value);
        //}

      //  Iterator<Map.Entry<Integer, String>> iterator1 = dataList.entrySet().iterator();
       // while (iterator1.hasNext()) {
           // Map.Entry<Integer, String> entry = iterator1.next();
          //  System.out.println(entry.getKey());
           // System.out.println(entry.getValue());


