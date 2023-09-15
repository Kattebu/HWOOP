package HW3;

import HW3.Domen.Student;
import HW3.Domen.StudentGroup;
import HW3.Domen.StudentStream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student("Иван", 25);
        Student s2 = new Student("Игорь", 23);
        Student s3 = new Student("Олег", 22);
        Student s4 = new Student("Маша", 23);
        Student s5 = new Student("Даша", 23);
        Student s6 = new Student("Лена", 22);
        Student s7 = new Student("Юра", 24);

        List<Student> groupList1 = new ArrayList<Student>();
        groupList1.add(s1);
        groupList1.add(s2);
        groupList1.add(s3);

        List<Student> groupList2 = new ArrayList<>();
        groupList2.add(s4);
        groupList2.add(s5);

        List<Student> groupList3 = new ArrayList<>();
        groupList3.add(s6);
        groupList3.add(s7);

        StudentGroup group5123 = new StudentGroup(groupList1, 5123);
        StudentGroup group5124 = new StudentGroup(groupList2, 5124);
        StudentGroup group5125 = new StudentGroup(groupList3, 5125);

        List<StudentGroup> studentGroups = new ArrayList<StudentGroup>();
        studentGroups.add(group5123);
        studentGroups.add(group5124);
        studentGroups.add(group5125);

        System.out.println(group5123);
        for (Student s : group5123) {
            System.out.println(s);
        }
        System.out.println();
        System.out.println();
        Collections.sort(group5123.getGroup());
        for (Student s : group5123) {
            System.out.println(s);
        }

        StudentStream studSream1 = new StudentStream(studentGroups, 1);
        studSream1.addGroup(group5123);
        studSream1.addGroup(group5124);
        studSream1.addGroup(group5125);

        /**
         * Сортировка групп по количеству студентов
         */
        studSream1.sortGroups();
        System.out.println("сортировка по количеству студентов: \n" + studSream1.toString());

        /**
         * Сортировка по ID группы
         */
        studSream1.sortGroupsById();
        System.out.println(
                "сортировка групп по ID группы : \n" + studSream1.toString());
    }
}
