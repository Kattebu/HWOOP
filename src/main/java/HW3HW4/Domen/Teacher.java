package HW3HW4.Domen;

public class Teacher extends Person{
    public Teacher(String name, int age, String acaDegree) {
        super(name, age);
        this.acaDegree = acaDegree;
    }

    private String acaDegree;

    public String getAcaDegree() {
        return acaDegree;
    }

    public void setAcaDegree(String acaDegree) {
        this.acaDegree = acaDegree;
    }

}
