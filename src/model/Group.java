package model;

import java.util.List;

public class Group {
    private int number;
    private Teacher Teacher;
    private String Student;

    public List<model.Student> getStudents() {
        return students;
    }

    public void setStudents(List<model.Student> students) {
        this.students = students;
    }

    private List<Student> students;

    public Group(int number, Teacher teacher, String student) {
        this.number = number;
        this.Teacher = teacher;
        this.Student = student;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public model.Teacher getTeacher() {
        return Teacher;
    }

    public void setTeacher(Teacher teacher) {
        Teacher = teacher;
    }

    public String getStudent() {
        return Student;
    }

    public void setStudent(String student) {
        Student = student;
    }
}
