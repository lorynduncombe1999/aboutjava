package com.example.demo.oop;

public class MultiLevelIntro {

}



class School{
    String departmentInfo;
    String teacherInfo;
    String Subject;
}

class Department  extends School{
    void printDepartment(){
        departmentInfo = "IT services";
    }

}
class Teacher extends Department{
    void  printTeacherInfo(){
        teacherInfo = "About  teachers Stuff";
    }
}


class Subject extends Teacher{
    void  printSubjects(){
        Subject = "This is a class  about School";
    }

}
