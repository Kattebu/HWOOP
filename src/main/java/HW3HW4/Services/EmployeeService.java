package HW3HW4.Services;

import HW3HW4.Domen.Employee;
import HW3HW4.Domen.PersonComparator;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService implements iPersonService<Employee>{
    private int count;
    private List<Employee> employees;

    public EmployeeService(){
        this.employees = new ArrayList<Employee>();
    }

    @Override
    public List<Employee> getAll() {
        return employees;
    }

    @Override
    public void create(String name, int age) {
        Employee empls = new Employee(name, age,"basic");
        count++;
        employees.add(empls);
    }

    public void sortByFIO(){
        PersonComparator<Employee> persComp = new PersonComparator<Employee>();
        employees.sort(persComp);
    }
}
