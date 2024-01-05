package ex14.example1;

import java.util.Arrays;
import java.util.List;

public class CopyEx02 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4);

        // map
        List<Integer> newList =list.stream().map((i) -> i*100).toList();  // 람다식을 써서 구현 할 수 있다.

        // forEach
        newList.stream().forEach(i -> System.out.println(i));

        // 흩뿌려 놓고 forEach로 바꿈 콜렉트를 안함 --> 컨슈머는 보이드라서




    }
}
