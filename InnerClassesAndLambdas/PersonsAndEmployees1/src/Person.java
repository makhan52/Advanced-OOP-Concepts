import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String name;
    private LocalDate birthDate;


    private class Position {
        protected double salary ;
        protected String name ;

        public String toString() {
            return name +":" + salary;
        }
    }

    public Person (String name, String bDate) {
        this.name = name;
        this.birthDate = LocalDate.parse(bDate);
    }

    Position position = new Position();

    public int getAge() {
        LocalDate today = LocalDate.now();
        Period p = Period.between(this.birthDate, today);
        int age = p.getYears();
        return age;
    }

    public void setPosition(String nm, double pSalary) {
        position.name = nm;
        position.salary = pSalary;
    }

    public String getPosition(){
        return position.name + "salary: " + position.salary;
    }

    public String toString() {
        return "name: " + name + "\n" +
                "age: " + getAge() + "\n" +
                "position: " + position.name + "\n" +
                "salary: " + position.salary;
    }
}
