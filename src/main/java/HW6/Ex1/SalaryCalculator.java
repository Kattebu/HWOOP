package HW6.Ex1;

public class SalaryCalculator {
    private int baseSalary;

    public SalaryCalculator(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int calculateNetSalary() {
        int tax = (int) (baseSalary * 0.25);//calculate in otherway
        return baseSalary - tax;
    }
}
