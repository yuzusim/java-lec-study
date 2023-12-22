package ex06.example5;

class 왕 {
    public void 심문() {
        System.out.println("왕은 심문한다.");
    }
}

class 왕비 {
    public void 심문() {
        System.out.println("왕은 심문한다.");
    }
}

class 모자장수 {
    public void 대답() {
        System.out.println("모자장수는 대답한다.");
    }
}

class 토끼 {
    public void 대답() {
        System.out.println("토끼는 대답한다.");
    }
}

public class Allia { // AliceApp


    public static void main(String[] args) {
        왕비 u1 = new 왕비();
        토끼 u2 = new 토끼();

        u1.심문();
        u2.대답();


    }
}
