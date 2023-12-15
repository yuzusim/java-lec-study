package ch03;

import java.util.Scanner;

public class PrintNumberEn {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        while(true){
            System.out.println("정수를 입력하세요.");
            int p=sc.nextInt();
            if(p==1){
                System.out.println("ONE");
            }
            else if(p==2){
                System.out.println("TWO");
            }
            else if(p==3){
                System.out.println("THREE");
            }
            else if(p==4){
                System.out.println("FOUR");
            }
            else if(p==5){
                System.out.println("FIVE");
            }
            else if(p==6){
                System.out.println("SIX");
            }
            else if(p==7){
                System.out.println("SEVEN");
            }
            else if(p==8){
                System.out.println("EIGHT");
            }
            else if(p==9){
                System.out.println("NINE");
            }
            else{
                System.out.println("OTHER");
                break;
            }
        }
    }
}
