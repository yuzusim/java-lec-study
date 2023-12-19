package ex04;

// add, minus, divide(나누기) , multi(곱하기)
public class CalculatorApp {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int result = cal.add(50, 80); // 실행시 값을 담을 수 있다.
        System.out.println("add:" + result);

        int result2 = cal.minus(10, 5);
        System.out.println("minus: " + result2);

        int result3 = cal.divide(10, 5);
        System.out.println("divide: " + result3);

        int result4 = cal.multi(5, 8);
        System.out.println("multi: " + result4);

    }
}
