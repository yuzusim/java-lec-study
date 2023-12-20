package ex03;

public class TelevisonTest {
    private int channel;
    private int volume;
    private boolean onOff;

    TelevisonTest(int c, int v, boolean o) {
        channel = c;
        volume = v;
        onOff = o;
    }

    void print() {
        System.out.println("채널은 " + channel + "볼륨은" + volume + "입니다.");
    }


    public static void main(String[] args) {
        TelevisonTest myTv = new TelevisonTest(7, 10, true);
        myTv.print();

        TelevisonTest yourTv = new TelevisonTest(11, 20, true);
        yourTv.print();


    }
}
