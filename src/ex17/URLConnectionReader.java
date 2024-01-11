package ex17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

// www.naver.com 데이터 일거서 콘솔표시
public class URLConnectionReader {
    public static void main(String[] args) throws IOException {
        URL site = new URL("http://www.naver.com/");
        URLConnection url = site.openConnection();
        BufferedReader in = new BufferedReader(
                new InputStreamReader(url.getInputStream())
        );
        String inLine;
        while ((inLine = in.readLine()) != null)
            System.out.println(inLine);
        in.close();

    }
}

