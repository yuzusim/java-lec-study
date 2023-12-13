package ch02;

public class CompOperator {
    public static void main(String[] args) {
        System.out.println((3==4)+"");
        System.out.println((3!=4)+"");
        System.out.println((3>4)+"");
        System.out.println((3<4)+"");

        System.out.println((3==3&&4==7)+""); //하나가 거짓이면 전체가 거짓(and)
        System.out.println((3==3||4==7)+""); //하나만 참이면 전체가 참(or)
    }
}
