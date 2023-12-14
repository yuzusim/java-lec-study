package ch03;
//정수의 합 계산하기
public class Sum {
    public static void main(String[] args) {
        int sum=0;

        for(int i=1;i<=10;i++){
            sum += i;
        }
        System.out.println("1부터 10까지를 더한 정수의 값은"+sum+"입니다.");
    }
}
