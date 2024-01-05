package ex14.example1;

import java.util.ArrayList;
import java.util.List;

public class CopyEx01 {
    public static void main(String[] args) {
        // var list = Arrays.asList(1,2,3,4);
        var list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        //var newList = list.stream().map(i -> i+"").toList();
        // 1 한테간다.
        // 문자열 1 리턴 됨
        // 문자열 2 리턴 됨
        // 문자열 3 리턴 됨
        // 문자열 4 리턴 됨
        // 다시 toList() 감싼다. --> 정계 연산자


//        var newList = list.stream().toList();
//        // 객체를 복사하면서 값을 변형하기 위해
//        // 컬렉션 복사 코드
//        // 불변 객체가 됨
//
//        System.out.println(list.hashCode());
//        System.out.println(newList.hashCode());


        // 컬렉션 복사
        //List<Integer> newList = new ArrayList<>(list);
        List<Integer> newList = new ArrayList<>();
        newList.add(5);

        System.out.println(list.size());
        System.out.println(newList.size());


        // list hashCode 추상메서드 가지고 있다.


        
    }
    
    

    
    
    
    
//
//            var list = Arrays.asList(1,2,3,4);
//    list.add(5);
    //var <Integer> list = Arrays.asList(1,2,3,4);
    //
    // 

}
