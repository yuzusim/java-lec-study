package ex04;

class Person2{
    int age = 10;
    char gender = '남';
}

public class MemEx02 {
    public static void main(String[] args) {
        System.out.println("1년 지남");
        System.out.println("2년 지남");
        System.out.println("3년 지남");

        Person2 p = new Person2(); //동적 할당, heap에 할당, 여러번 띄울 수 있다.
        //변수를 만들어주어야 한다.
        System.out.println(p.age);
        System.out.println(p.gender);

        System.out.println("메인 종료");
    }
}
