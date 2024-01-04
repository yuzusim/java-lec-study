package ex16;
// Thread 클래스 상속하여 스레드 생성하기
class MyThread extends Thread{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
    }

}

public class MyThreadTest01 {
    public static void main(String[] args) {
        Thread t = new MyThread();
        t.start();
        // start() 메서드를 호출해야만 스레드가 실행된다.
    }
}
