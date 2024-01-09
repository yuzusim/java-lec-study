package ex15;
//
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StreamEx02 {
    public static void main(String[] args) {
        //InputStream input = System.in;
        InputStreamReader ir = new InputStreamReader(System.in); // ir은 키보드에 연결 된 객ㅊㅔ
        char[] ch = new  char[4]; //보조 스트림

        try {
            ir.read(ch); // ch가 보조 스트림을 읽을 것

            for (char c : ch){
                System.out.print(c + "");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
