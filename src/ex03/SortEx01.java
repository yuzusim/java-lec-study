package ex03;

//기준점 final i=0(해당 위치 변경), p=0(교환 인덱스)
        /*
        5,8(0(p),1(for문 증가 위치))
        5,2(0,2) p = 2
        2,4(2,3)
        2,3(3,4)
        if(i!=p)
        2, 8, 5, 4, 3 (i, p 교환)

        final i=1(해당 위치 변경), p=1(교환 인덱스)
        8,5(1,2) p = 2
        5,4(2,3) p = 3
        4,3(3,4) p = 4
        if(i!=p) 2, 3, 5, 4, 8

        final i=2(해당 위치 변경), p=2(교환 인덱스)
        5,4(2,3) p = 3
        4,8(3,4)
        if(i!=p) 2, 3, 4, 5, 8

        final i=3(해당 위치 변경), p=3(교환 인덱스)
        5,8(3,4)
        if(i!=p) X
        */
public class SortEx01 {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 4, 3};

        for (int i = 0; i < 10; i++) {

        }


    }

}
