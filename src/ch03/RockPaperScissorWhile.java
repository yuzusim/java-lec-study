package ch03;
//가위, 바위, 보 게임 while문으로 반복
import java.util.Scanner;

public class RockPaperScissorWhile {
    final int Scissor=0;
    final int Rock=1;
    final int Paper=2;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("가위바위보 게임입니다." +
                    "가위(0), 바위(1), 보(2) 중 하나를 입력하세요.");
            int user=sc.nextInt();

            int computer= (int) (Math.random()*3);
            if(user==computer){
                System.out.println("비겼습니다.");
            }else if(user==(computer+1)%3){
                System.out.println("인간: "+user+"컴퓨터: "+computer+"인간 승리");
            }else{
                System.out.println("인간: "+user+"컴퓨터: "+computer+"컴퓨터 승리");
            }
        }
    }
}
