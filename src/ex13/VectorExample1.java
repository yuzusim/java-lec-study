package ex13;

import java.util.Collections;
import java.util.Vector;

public class VectorExample1 {
    public static void main(String[] args) {

        Vector<String> vec = new Vector<>();
//        벡터는 초기에 어떤 용량으로 시작할지 내부적으로 결정하게 된다.
//        만약 성능 문제가 발생한다면, 벡터는 동적으로 크기를 조절하므로 사용 중인
//        데이터에 맞게 자동으로 조절될 것이다.

        // 객체 추가
        vec.add("Apple");
        vec.add("Orange");
        vec.add("Mango");

        // 크기
        System.out.println("벡터의 크기 " + vec.size());

        // 인덱스 접근
        System.out.println(vec.get(1));
        // 벡터에서 값을 get() 메서드로 추출 → 1번 인덱스에 접근해서 값을 추출했다.

        System.out.println();

        // 정렬(오름차순)
        Collections.sort(vec);

        // 정렬된 결과 출력
        for (String s : vec) {
            System.out.println(s + " ");
        }

        System.out.println();

        //정렬(내림차순)
        Collections.sort(vec, Collections.reverseOrder());

        // 정렬된 결과 출력
        for (String s : vec) {
            System.out.println(s + " ");
        }

        System.out.println();

        // 정렬 다른방법
        //Arrays.sort();

        //삭제
        String result = vec.remove(2); // 인덱스 번호로 삭제
        System.out.println(result);
        System.out.println(vec.size()); // 번호로 삭제 확인

        // 값 찾기 (mango, Mango, mAngo, MANGO) --> 배열안에 대소문자가 이렇게 있을 수 있다.
        boolean search = vec.contains("Mango");
        // 컨테인즈가 void 면 있는지 없는지 알 수 없다.
        // 리턴이 필요
        // 결과를 알아야하니까
        System.out.println(search);


    }
}
