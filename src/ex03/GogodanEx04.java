package ex03;

class Gogodanutil {
    static void gogodan(int x) { //파라미터 스택영역
        for (int i = 1; i <= 9; i++) {
            System.out.println(x + "*" + i + "=" + (x * i));
        }
        System.out.println();
    }
}

public class GogodanEx04 {
    public static void main(String[] args) {
        //
        // 구구단을 출력해주는 메서드
        // ex) Gogodanutil.gogodan(5);
        // Gogodanutil 클래스에 gogodan 정적 메서드를 호출하시오.
        // 파라미터는 int 한개가 필요합니다.

        Gogodanutil.gogodan(8);


    }
}


