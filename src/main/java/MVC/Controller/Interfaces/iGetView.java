package MVC.Controller.Interfaces;

import MVC.Model.Core.Student;

import java.util.List;

public interface iGetView {
    void printAllStudent(List<Student> students);


    String prompt(String s);
}
