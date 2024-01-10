package ex17.half;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(20000); // 리슨을 대기하고 있음
            Socket socket = serverSocket.accept(); // accept() --> 클라이언트가 소켓 요청 되면 소켓이 만들어짐 , 내부에서 while 돌면서 확인 누가 요청하는 지를 확인

            // 소켓 연결완료

            // 버퍼 만들기 (recevied)
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            );

            String requestMsg = br.readLine();
            System.out.println("클라이언트로부터 받은 메세지: " + requestMsg);

            // 버퍼 만들기(sand)
            PrintWriter pw = new PrintWriter(socket.getOutputStream(), true, Charset.forName("UTF-8")); // PrintWriter = BufferedWriter 가리킴

            if (requestMsg.equals("1")){
                pw.println("영화"); // 통신에서 println 역슬래쉬의 의미
            }else if(requestMsg.equals("2")){
                pw.println("드라마");
            }else{
                pw.println("프로토콜을 확인하세요: 1은 영화, 2는 드라마");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


// c --> wr
// 서버 -->rd

// 스윙을써서 돌고 있는 코드면 강제 종료 시켜야 함
// 우리는 메인이 종료 될꺼니 필요 없다.
