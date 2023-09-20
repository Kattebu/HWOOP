package HW5.View;


import java.util.Scanner;
import java.util.List;
import java.util.Scanner;

import HW5.Controller.Interfaces.iGetView;
import HW5.Model.Core.Student;

public class ViewClass implements iGetView {

    public void printAllStudent(List<Student> students)
    {
        System.out.println("----------- Список студентов -----------");
        for(Student s : students)
        {
            System.out.println(s);
        }
        System.out.println("----------------------------------------");
    }

    public String prompt(String msg)
    {
        Scanner in = new Scanner(System.in);
        System.out.println(msg);
        return in.nextLine();
    }
}
