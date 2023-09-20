package MVC.View;

import MVC.Controller.Interfaces.iGetView;
import MVC.Model.Core.Student;

import java.util.List;

public class ViewClass implements iGetView {
    public void printAllStudent(List<Student> students){
        System.out.println("--список студентов--");
        for (Student s: students){
            System.out.println(s);
        }
        System.out.println("----");
    }

    @Override
    public String prompt(String s) {
        return null;
    }
}
