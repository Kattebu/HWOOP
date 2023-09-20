package HW5.Controller.Interfaces;
import java.util.List;

import HW5.Model.Core.Student;

public interface iGetView {
    void printAllStudent(List<Student> students);
    String prompt(String msg);
}
