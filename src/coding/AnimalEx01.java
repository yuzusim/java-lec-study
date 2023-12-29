package coding;

class Animal{
    public static void A(){
        System.out.println("Anmal");
    }
}

class Dog extends Animal{
    public static void A(){
        System.out.println("Dog");
    }
}

public class AnimalEx01 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Animal a = dog;
        a.A();
        dog.A();
    }
}







