package ex07.example;

import javax.swing.*;
import java.awt.*;

public class MyFrameEx01 {

    static int num = 1;

    public static void main(String[] args) {
        JFrame jf = new JFrame();
        // jf.setLayout(new BoxLayout());
        jf.setSize(300, 500); // 사이즈 정하기


        JButton brn1 = new JButton("더하기");
        JButton brn2 = new JButton("빼기");

        JLabel la1 = new JLabel(num + "");


        jf.add("North", brn1);
        jf.add("South", brn2);
        jf.add("Center", la1);

        // 중요!!
        // 커트롤 + 스페이스 --> (e ->); --> 람다식
        // 타입 생략 가능함
        brn1.addActionListener(e -> {
            num++;
            la1.setText(num + "");
        });

        brn2.addActionListener(e -> {
            num--;
            if (num < 0) {
                num = 0;
            }
            la1.setText(num + "");
        });

        jf.setVisible(true); // 보여줌

        // jf.add("North", new JButton("클릭"));
        // jf.add(new JButton("클릭"));


    }
}
