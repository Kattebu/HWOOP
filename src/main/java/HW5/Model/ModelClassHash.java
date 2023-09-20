package HW5.Model;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import HW5.Controller.Interfaces.iGetModel;
import HW5.Model.Core.Student;

public class ModelClassHash implements iGetModel{
    private HashMap<Long,Student> students;

    /**
     *Конструктор класса принимает HashMap<Long,Student> как параметр и инициализирует поле students.
     */

    public ModelClassHash(HashMap<Long,Student> students) {
        this.students = students;
    }
    /**
     *Метод getStudents() возвращает список всех объектов Student, хранящихся в HashMap.
     */
    public List<Student> getStudents() {
        return new ArrayList<Student>(students.values());
    }
}
