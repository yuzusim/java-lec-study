package ex03;

public class TheaterSeats02 {
    public static void main(String[] args) {
        // 배열 구조 변경 불가능
        int[][] seats = {
                {0, 0, 0, 1, 1, 0, 0, 0, 0, 0},
                {0, 0, 1, 1, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 1, 1, 1, 0},
                {1, 1, 0, 0, 0, 0, 1, 1, 1, 0}
        };
        //3, 10배열

        //seats[0][7] = 1; // 0행 7열 앉고 `싶을때 배치
        //seats[0][7] = 0; // 값을 없애고 싶을때, 완전 삭제는 불가능, 배열은 공간길이를 늘리거나 줄일 수 없기 때문에

        int sum = 0;
        int count = 0;
        //int row = -1; //초기화

        for (int row = 0; row < seats.length; row++) {
            count = 0;
            for (int i = 0; i < seats[row].length; i++) {
                //System.out.println(seats[row][i]);
                count = count + seats[row][i];
            }
            System.out.println(row + "번째 행의 관객수는: " + count);
            sum = sum + count;
        }
        System.out.println("전체 관객수는: " + sum);

//       row++;
//       count = 0;
//       // 반복되는 배열을 for 문으로 돌려서 확인
//       for (int i = 0; i < seats[row].length; i++) {
//           System.out.println(seats[row][i]);

//           //int count = seat1[i];
//           //int count = count + seat1[i]; //누적코드 = 자기값 + 새로운값 더해서 넣음, for문 위에 선언해야지 누적 될 수 있음
//           count = count + seats[row][i];
//       }
//       System.out.println(row + "번째 행의 관객수는: " + count);
//       sum = sum + count;

//       row++;
//       count = 0;
//       for (int i = 0; i < seats[row].length; i++) {
//           System.out.println(seats[row]);
//           count = count + seats[row][i];
//       }
//       System.out.println(row + "번째 행의 관객수는: " + count);
//       sum = sum + count;

//       row++;
//       count = 0;
//       for (int i = 0; i < seats[row].length; i++) {
//           System.out.println(seats[row][i]);
//           count = count + seats[row][i];
//       }
//       System.out.println(row + "번째 행의 관객수는: " + count);
//       sum = sum + count;

//       row++;
//       count = 0;
//       for (int i = 0; i < seats[row].length; i++) {
//           System.out.println(seats[row][i]);
//           count = count + seats[row][i];
//       }
//       System.out.println(row + "번째 행의 관객수는: " + count);
        //       sum = sum + count;

        //System.out.println("전체 관객수는: " + sum);
    }

}



