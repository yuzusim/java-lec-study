package ex13.example5;


class Model<T> {
    private T data;

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}

class User {
    public int id = 1;
    public String name = "홍길동";
    public String email = "ssar@nate.com";

    public void hello() {
        System.out.println("안녕하세요");
    }
}

public class GenericEx05 {
    public static void main(String[] args) {
        Model<User> m = new Model(); // Model 클래스에 User 타입을 지정한 제네릭 객체 생성
        m.setData(new User()); // setData 메서드를 사용하여 User 객체를 설정

        User u = m.getData(); // getData 메서드를 사용하여 User 객체를 가져옴
        u.hello(); // User 클래스의 hello 메서드 호출
    }
}