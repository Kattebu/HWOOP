package HW5.View;

import java.util.Scanner;
import java.util.List;

import HW5.Controller.Interfaces.iGetView;
import HW5.Model.Core.Student;

public class ViewClassEng implements iGetView{
    /**
     *Метод принимает список студентов и выводит их на экран.
     */
    public void printAllStudent(List<Student> students)
    {
        System.out.println("----------- List of Students -----------");
        for(Student s : students)
        {
            System.out.println(s);
        }
        System.out.println("----------------------------------------");
    }

    /**
     *Метод принимает сообщение в качестве аргумента, выводит его на экран и возвращает строку, введенную
     * пользователем с клавиатуры
     */
    public String prompt(String msg)
    {
        Scanner in = new Scanner(System.in);
        System.out.println(msg);
        return in.nextLine();
    }
}
