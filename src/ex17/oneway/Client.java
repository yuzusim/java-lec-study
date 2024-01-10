package ex17.oneway;
// Client : 요청하는 자
// a : Client
// b : Server --> 메세지 같은 걸 받아서 처리 (값)

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        // localhost = 127.0.0.1(루프백)
        // 현재 프로그램이 실행되는 로컬 호스트의 이름
        try {
            Socket socket = new Socket("127.0.0.1", 10000); // IP, 포트 생성

//            Scanner sc = new Scanner(System.in);
//            String msg = sc.nextLine();
//
//            BufferedWriter bw = new BufferedWriter(
//                    new OutputStreamWriter(socket.getOutputStream(),"UTF-8")
//            );
//
//            bw.write(msg + "\n");
//            bw.write(msg);
//            bw.flush();

            // 가나다라abc
            BufferedWriter bw = new BufferedWriter(
                    new OutputStreamWriter(socket.getOutputStream(), "UTF-8")
            );

            bw.write("msg1" + "\n");
            bw.write("msg2" + "\n");
            bw.flush();


        } catch (IOException e) {
            //throw new RuntimeException(e);
           // System.out.println(e.getMessage());
            e.printStackTrace(); // 에러를 자세히 보여줌, Trace이 추적한다는 뜻
            // 에러는 맨 위에서 부터 본다.


        }
    }
}