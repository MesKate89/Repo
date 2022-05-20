package com.company;

import model.Address;
import model.Group;
import model.Student;
import model.Teacher;
import repositoriy.Grouprepositoriy;
import service.Groupservice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        Grouprepositoriy grouprepositoriy = new Grouprepositoriy();
        Groupservice groupservice=new Groupservice(grouprepositoriy);

        groupservice.addGroups(Arrays.asList());
        Address address1 = new Address("Дмитриева", 8);
        Student student1 = new Student("Nikol", 25, address1);
        student1.displayInfo();

        Address address2 = new Address(38, true);
        Student student2 = new Student("Lena", 21, address2);
        student2.displayInfo();

        Student student3 = new Student("Nikita", 32, address2);
        student3.displayInfo();

        Teacher teacher = new Teacher("Mariya", 30, "Sokolova", address1 );
        Group group1 = new Group(12, teacher, "Nikita");

        List<Student> students=new ArrayList<>();
        students.add(student1);
        students.add(student2);

        List<Group> groups =new ArrayList<>();
        groups.add(group1);
        groupservice.addGroups(groups);

    }
}
