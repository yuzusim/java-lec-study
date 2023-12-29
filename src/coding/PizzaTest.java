package coding;
// 인수전달방법 --> 객체 전달 경우
class Pizza{
    int radius;
    // 클래스 정의

    Pizza(int r){
        radius = r;
    }

    Pizza whoLagest(Pizza p1, Pizza  p2){
        // whoLagest() 메서드 사용
        // p1, p2 객체 2개의 값을 받음
        if(p1.radius > p2.radius){
            return p1;
        }else{
            return  p2;
        }
    }

}

public class PizzaTest {
    public static void main(String[] args) {
        Pizza obj1 = new Pizza(14);
        Pizza obj2 = new Pizza(18);

        Pizza lagest = obj1.whoLagest(obj1,obj2);
        System.out.println(lagest.radius);


    }
}
