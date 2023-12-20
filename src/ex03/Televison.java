package ex03;

public class Televison {
    int channel;
    int volume;
    boolean onOff;


    public static void main(String[] args) {
        Televison myTv = new Televison();
        myTv.channel = 7;
        myTv.volume = 10;
        myTv.onOff = true;

        Televison youreTv = new Televison();
        youreTv.channel = 9;
        youreTv.volume = 12;
        youreTv.onOff = true;
        
        System.out.println("나의 텔레비전 채널은" + myTv.channel + "이고 볼륨은" + myTv.volume + "입니다.");
        System.out.println("너의 텔레비전 채널은" + youreTv.channel + "이고 볼륨은" + youreTv.volume + "입니다.");


    }
}
