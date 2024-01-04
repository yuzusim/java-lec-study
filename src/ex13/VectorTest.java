package ex13;

import java.util.Vector;

public class VectorTest {
    public static void main(String[] args) {
        Vector vc = new Vector(); // 벡터 객체를 생성할때 크기를 주지 않아도 된다.

        // 어떤 타입의 객체도 추가가 가능하다.
        vc.add("Hello World");
        vc.add(new Integer(10));
        vc.add(20);

        System.out.println("vector size: " + vc.size());

        for (int i = 0; i < vc.size(); i++) {
            System.out.println("vector element" + i + ": " + vc.get(i));
        }

        String s = (String)vc.get(0);
        System.out.println(s);



    }
}
