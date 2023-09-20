package HW5.Model;
import java.util.List;

import HW5.Controller.Interfaces.iGetModel;
import HW5.Model.Core.Student;

public class ModelClassList implements iGetModel{
    private List<Student> students;

    public ModelClassList(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }
}
