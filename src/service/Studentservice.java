package service;

import model.Student;
import repositoriy.Grouprepositoriy;
import repositoriy.Studentrepositoriy;

import java.util.List;

public class Studentservice {

    private Studentrepositoriy studentrepositoriy;

    public Studentservice(Studentrepositoriy grouprepositoriy) {
        this.studentrepositoriy = studentrepositoriy;
    }
    public void removeStudents (List<Student> removeStudents) {
        removeStudents.forEach(a-> System.out.println(a));
        studentrepositoriy.removeStudents(removeStudents);

    }

    public void addGroups(List<Student> newStudents) {
        newStudents.forEach(m -> System.out.println(m));
        studentrepositoriy.addStudents(newStudents);
    }

}