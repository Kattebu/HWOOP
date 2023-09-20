package HW5.Controller;
import java.util.ArrayList;
import java.util.List;

import HW5.Controller.Interfaces.iGetModel;
import HW5.Controller.Interfaces.iGetView;
import HW5.Model.ModelClassList;
import HW5.Model.Core.Student;
import HW5.View.ViewClass;

public class ControllerClass {
    private iGetModel model;
    private iGetView view;
    private List<Student> students = new ArrayList<Student>();

    public ControllerClass(iGetModel model, iGetView view) {
        this.model = model;
        this.view = view;
    }

    private boolean testData(List<Student> studs)
    {
        if(studs.size()>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void update() {

        //MVP
        students = model.getStudents();

        if(testData(students))
        {
            view.printAllStudent(students);
        }
        else{
            System.out.println("Список студентов пуст!");
        }


        // MVC
        //view.printAllStudent(model.getStudents());
    }

    /**
     * Метод запуска программы и обработки команд пользователя.
     * Добавлена команда DELETE для удаления студента по его номеру.
     * Если такого номера нет, выводится сообщение об ошибке.
     */
    public void run()
    {
        Command com = Command.NONE;
        boolean getNewIter = true;
        while(getNewIter)
        {
            String command = view.prompt("Введите команду:");
            com = Command.valueOf(command.toUpperCase());
            switch(com)
            {
                case EXIT:
                    getNewIter = false;
                    System.out.println("Выход из программы");
                    break;
                case LIST:
                    view.printAllStudent(model.getStudents());
                    break;
                case DELETE:
                    long id = Long.parseLong(view.prompt("Введите номер студента для удаления:"));
                    boolean isDeleted = model.deleteStudent(id);
                    if(isDeleted){
                        System.out.println("Студент с номером " + id + " удален.");
                    }
                    else{
                        System.out.println("Студента с номером " + id + " не существует.");
                    }
                    break;
            }
        }
    }
}
