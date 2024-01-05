package ex14.example1;

import java.util.Arrays;
import java.util.List;

public class CopyEx03 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4);

        // filter 필터링 해서 복사 --> 기존 값 유지하기 위해
        List<Integer> newList =list.stream().filter(i -> i < 3).toList();
        newList.stream().forEach(i -> System.out.println(i));



    }

}
