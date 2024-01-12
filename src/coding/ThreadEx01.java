package coding;

class ThreadTest extends Thread{
    public void run(){
        for (int i = 0; i <=10 ; i++) {
            System.out.print(i + "");
        }
    }
}

public class ThreadEx01 {
    public static void main(String[] args) {
        Thread t = new ThreadTest();
        t.start();
    }
}
