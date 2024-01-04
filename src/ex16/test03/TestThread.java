package ex16.test03;

class MyRunnable implements Runnable{
    String myName;
    public MyRunnable(String name){
        myName = name;
    }
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.print(myName + i + " ");
        }
    }
}


public class TestThread {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable("A"));

        t1.start();
    }
}
