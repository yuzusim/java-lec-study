package ex17;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

// hostname 받아서 IP 주소로 변환
public class ShapeTest {
    public static void main(String[] args) throws IOException{
        String hostname = "www.naver.com";

        try {
            InetAddress address = InetAddress.getByName(hostname);
            System.out.println("IP 주소: " + address.getHostAddress());
        } catch (UnknownHostException e) {
            //throw new RuntimeException(e);
            System.out.println(hostname + "의 IP 주소를 찾을 수 없습니다.");
        }


    }
}
