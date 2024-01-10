package ex17.oneway;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    // Server : 요청하는 받는 애

    public static void main(String[] args) {
         try {
             ServerSocket serverSocket = new ServerSocket(10000); // 소켓생성 IP, 포트 번호 필요

             Socket socket = serverSocket.accept(); // 서브 소켓, 리스너, while 돌면서 확인 누가 요청하는 지를 확인
             System.out.println("클라이언트 연결 됨"); // 클라이언트가 요청을 하면

             BufferedReader br = new BufferedReader(
                     new InputStreamReader(socket.getInputStream(), "UTF-8")
             );
//             String msg = br.readLine(); //있는 걸 끝까지 다돌려야함
//             System.out.println(msg);

             while (true) {
                 String msg = br.readLine();

                 if (msg == null) break;

                 System.out.println(msg);
             }
             // 단방향 통신은 모두 \n를 붙여야함
             // 받는 애는 와일을 돌리면서 받아야함




        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
