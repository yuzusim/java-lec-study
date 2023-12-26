package ex06;

class Person {
    private String regnumer;
    private double weight;
    protected int age;
    String name;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

class Student extends Person {
    int id;
}

public class StudentTest {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.age = 21;
        obj.name = "kim";
        obj.setWeight(75.0);

    }
}
