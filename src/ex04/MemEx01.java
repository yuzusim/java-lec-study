package ex04;

class Person1{
    static int age = 20; //jvm을 실행할 때 먼저 static을 찾는다.
    static char gender = '여';

} //커스텀 자료형
public class MemEx01 {
    public static void main(String[] args) {
        System.out.println(Person1.age);
        System.out.println(Person1.gender);
    } //static을 찾은 후 main을 실행시킨다.
}
