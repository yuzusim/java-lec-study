package ex15;

import java.io.IOException;
import java.io.InputStream;

public class StreamEx01 {
    public static void main(String[] args) {
        InputStream input = System.in;
        // System.in --> 키보드에 연결 --> input 스트림
        // System.out -->
        
        // try-catch = 알트 + 엔트
        try {
            int value = input.read();
            System.out.println("받은 값: " + (char)value);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//
        // 파일, 모니터 출력 가능
        // io input은 하드디스크 입장에서 봐야함

        // 배열 고정길이
        // 버퍼 만들어서
//한 바이트씩 같는다
        //


    }
}
