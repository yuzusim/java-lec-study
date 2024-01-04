package ex16;
// Runnable 인터페이스 구현하는 방법
class MyRunnable implements Runnable{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
    }
}

public class MyRunnableTest02 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable());
        // Thread 객체를 생성 이때 MyRunnable 객체를 인수로 전달한다.
        t.start();

    }
}
