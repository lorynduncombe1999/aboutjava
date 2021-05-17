package com.example.demo.oop;
import ch.qos.logback.core.net.SyslogOutputStream;

import java.util.*;
public class employee {
    String empName;
    String empId;
    String empAddress;
    String empDept;
    String empOfficeLocation;

    public static void main(String[] args) {
        employee empOne = new employee();
        empOne.empName = "Mike Miller";
        empOne.empId = "101";
        empOne.empOfficeLocation = Organization.officeLocation;
        System.out.println(empOne.empName);
        System.out.println(empOne.empId);
        System.out.println(empOne.empOfficeLocation);
       Organization.getInfoAboutOrg();//for the static
        Organization obj = new Organization();
        obj.detailsInfo(); //non-static
    }

}

    class Organization {

    //static belongs to the class itself. Must use constructor + .  to  access ex:
        // empOne.empOfficeLocation = Organization.officeLocation;
        static String department = "IT services";
        static String officeLocation = "100 Main st DC VA" ;
        employee employeeList;

        public static void getInfoAboutOrg(){
            System.out.println("Go to the Home Page of the org website");
        }
public  void detailsInfo(){
    System.out.println("This is non-static  method of organization class");
}
    }