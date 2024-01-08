package ex14;

import java.util.HashMap;
import java.util.*;

public class StreamEx01 {
    public static void main(String[] args) {
        //HashMap은 map의 자식
        Map<String, Object> date = new HashMap<>();
        date.put("name", "홍길동");
        date.put("age", 20);

        Map<String, Object> date2 = new HashMap<>();
        date2.put("name", "홍길동");
        date2.put("age", 15);

        Map<String, Object> date3 = new HashMap<>();
        date3.put("name", "이순신");
        date3.put("age", 30);


        List<Map<String, Object>> arr = Arrays.asList(date, date2, date3);

        List<Map<String, Object>> newArr = arr.stream().map(d -> {
           int newAge = (Integer) d.get("age") - 1; //타입 자체가 오브젝트여서 다운 캐스팅해야 함
           d.put("age", newAge);
            return d;
        }).toList();

        newArr.stream().forEach(d -> {
            System.out.println(d.get("age"));
        });


        // 라이브러리 Map으로 만들어 둔 것이 많음
        // 왜? class로 만들지 않고 Map으로 만들까?
        // class로 안되는 경우 많음 --> 픽스되기 때문
        // 데이터 자료형 쓰고 싶을땐 --> 클래스로

        // 데이터가 3개가 고정 어디다 저장 할 것인가?
        // 배열, 컬렉션, 벡터
        // 연속적으로 ArrayList로 저장






    }
}
