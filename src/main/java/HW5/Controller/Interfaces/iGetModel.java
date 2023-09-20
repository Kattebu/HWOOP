package HW5.Controller.Interfaces;
import java.util.List;

import HW5.Model.Core.Student;

public interface iGetModel {
    public List<Student> getStudents();
    /**
     * Метод удаления студента по его номеру.
     * @param id студента
     * @return true, если студент был удален, false - в противном случае
     */
    boolean deleteStudent(long id);
}
