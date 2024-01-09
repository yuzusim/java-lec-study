package ex15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 보조스트림 --> 버퍼로 만듦
public class StreamEx03 {
    public static void main(String[] args) {
        InputStreamReader ir = new InputStreamReader(System.in); // 타겟만 바꿈, 상대 pc 객체
        BufferedReader br = new BufferedReader(ir);

        try {
            String line = br.readLine();
            System.out.println(line);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
