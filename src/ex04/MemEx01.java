package ex04;

// class를 커스텀 자료형으로 인식
class Person1 {
    static int age = 20;
    static char gender = '여';
}

public class MemEx01 {
    public static void main(String[] args) {
        System.out.println(Person1.age);
        System.out.println(Person1.gender);
    }
}

// static 메인이 실행 되기 전에 뜬다.
// 생성주기는 main이 끝날때까지

// 할당 --> 메모리를 효과 적으로 쓰려고 메모리를 관리 하기 위해
// static --> 정적할당
// Heap --> 동적할당
