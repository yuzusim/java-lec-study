package coding;

class MyRunnble implements Runnable{
    public void run(){
        for (int i = 0; i <=10 ; i++) {
            System.out.print(i + "");
        }
    }
}

public class MyRunnableTest {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnble());
        t.start();

    }
}
