package ex15;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class StreamEx04 {
    public static void main(String[] args) {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //
        try {
            bw.write("안녕\n"); // \n 엔터 역할
            bw.write("반가워\n");
            bw.flush(); // 반드시 flush 강제로 흘러가게 (데이터가 다 차지 않음)

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        // readLine 으로 읽음, \n 까지 읽음 --> 통신의 기본
        // 리퍼 버퍼가 앱이 소비, 버퍼드 리더
        // 통신에서 \n는 너 이번에 읽을때 여기까지 읽어라는 뜻
        // readLine 으로 한 라인을 읽음 --> 프로토콜로 약속 되어 있음
        // readLine이 없으면 통신이 안됨 버퍼에 있는 것을 꺼내지 못함 그래서 읽을 수가 없음
        // 통신의 가장 마지막에 붙임, 둘다 붙이든지 맨 마지막에 붙이든지 둘 중 하나는 해야함

        // 소캣 통신 내가 전송할때 Writer
        // 쓰는 사람 Writer
        // 읽는 사람 Reader


        // 반이중 --> 요청과 응답형태 --> 무전기 같은 것
        // 내가 보내고 응답까지
        // 보내는 사람 보내는 버퍼 읽는 버퍼
        // 받는 사람 읽는 버퍼 보내는 버퍼

        // http 가 쓴다
        // 주소 요청 BufferedWriter 읽고
        // HTML 코드 응답해준다.
        // f5 재요청
        // 동기적 실행 -> 스레드가 1만 있어도 된다.
        // 트리거가 있다.-> 작동해서 보내고 응답


        // 양방향, 전이중(쌍 방향) --> 계속 상대방에 읽어야 함, 부하가 심함 --> 전화기 같은 것
        // 채팅, 카톡 같은 것
        // 메인 스레드 하나로 동시에 일을 못한다.
        // 최소한 스레드 2개 필요

        // sand 쓰기만 하면 된다.
        // 상대방이 쓰는 메세지 버퍼에 찾는지 리더 해야됨
        
// State Pool full 요청자의 상태가 계속 기억
// State 미쓰 요청자의 상태 기억하지 않는 것, 상태(요청자)가 없다.



    }
}
