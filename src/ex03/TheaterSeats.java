package ex03;

public class TheaterSeats {
    public static void main(String[] args) {

        // 배열은 구조 변경 불가능
        int[][] seats = {
                {0, 0, 0, 1, 1, 0, 0, 0, 0, 0},
                {0, 0, 1, 1, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 1, 1, 1, 0}
        };

        int count=0;
        for(int i=0;i<seats.length;i++){
            for(int k=0;k<seats[i].length;k++)
                count += seats[i][k];
        }

        System.out.println("총 관객 수는"+count);
    }
}
