package HW3HW4.Controllers;

import HW3HW4.Domen.Person;

import java.util.List;

public class AccountController {

    public static <T extends Person> void paySalary(T person, int salary) {
        System.out.println(person.getName() + " была выплачена зп " + salary);
    }

    /**
     * Определяем средний возраст
     */
    public static <T extends Person> double averageAge(List<T> persons) {
        double sum = 0;
        int count = 0;
        for (Person p : persons) {
            sum += p.getAge();
            count++;
        }
        return sum / count;
    }
}
