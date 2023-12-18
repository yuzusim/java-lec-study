package ex04;

class Person4 {
    // 상태 = 변수
    private int weight = 100;

    // 확인용
    public int getWeight() {
        return weight;
    }

    // 변경 시키려면 행위를 통해 변경 시켜야 함
    // 접근 제어자 앞에 private 붙으면 어디에서도 접근 불가능, public 붙으면 어디에서도 접근 가능

    // 행위 = 메서드
    // void 리턴 안해줌
    public void exercies() {
        weight = weight - 10; // 감소 코드
    }

}

public class OOOPEx02 {
    public static void main(String[] args) {
        Person4 p4 = new Person4();
        System.out.println("p4의 몸무게: " + p4.getWeight());

        p4.exercies();
        System.out.println("p4의 몸무게: " + p4.getWeight());

        p4.exercies();
        System.out.println("p4의 몸무게: " + p4.getWeight());

        p4.exercies();
        System.out.println("p4의 몸무게: " + p4.getWeight());

        p4.exercies();
        System.out.println("p4의 몸무게: " + p4.getWeight());

        p4.exercies();
        System.out.println("p4의 몸무게: " + p4.getWeight());

        p4.exercies();
        System.out.println("p4의 몸무게: " + p4.getWeight());

        p4.exercies();
        System.out.println("p4의 몸무게: " + p4.getWeight());

        p4.exercies();
        System.out.println("p4의 몸무게: " + p4.getWeight());

        p4.exercies();
        System.out.println("p4의 몸무게: " + p4.getWeight());

        p4.exercies();
        System.out.println("p4의 몸무게: " + p4.getWeight());


    }
}
