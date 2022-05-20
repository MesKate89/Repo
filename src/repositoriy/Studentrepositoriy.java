package repositoriy;

import model.Group;
import model.Student;

import java.util.ArrayList;
import java.util.List;

public class Studentrepositoriy {

    private List<Student> students =new ArrayList<>();
    public void removeStudent(List<Student> students1){
        students.removeAll(students1);

    }
    public void addStudents(List<Student> newStudents){
        students.addAll(newStudents);
    }
    public List<Student> getstudents(){
        return students;
    }

    public void removeStudents(List<Student> removeStudents) {
    }
}
