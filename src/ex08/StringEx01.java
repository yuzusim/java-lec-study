package ex08;

public class StringEx01 {
    public static void main(String[] args) {
        // 1. length() 메서드: 문자열의 길이를 반환합니다.
        String str = "Hello, Java!"; // 스페이스 한 것 까지 포함
        int length = str.length();
        System.out.println("문자열 길이: " + length);  // 출력: 12


        // 2. charAt(int index) 메서드: 지정된 인덱스의 문자를 반환합니다.
        // 인덱스 0부터 시작
        char character = str.charAt(7);
        System.out.println("인덱스 7의 문자: " + character);  // 출력: J

        // 3. substring(int beginIndex) 메서드: 지정된 인덱스부터 문자열의 끝까지의 부분 문자열을 반환합니다.
        String substring = str.substring(7);
        System.out.println("인덱스 7부터의 부분 문자열: " + substring);  // 출력: Java!

        // 4. substring(int beginIndex, int endIndex)
        // 메서드: 지정된 시작 인덱스부터 지정된 끝 인덱스까지의 부분 문자열을 반환합니다.
        String sub = str.substring(7, 11);
        System.out.println("인덱스 7부터 11까지의 부분 문자열: " + sub);  // 출력: Java

        // 5. toLowerCase() / toUpperCase()
        // 메서드: 문자열을 소문자로 변환하거나 대문자로 변환합니다.
        String lowerCase = str.toLowerCase();
        String upperCase = str.toUpperCase();
        System.out.println("소문자로: " + lowerCase);
        System.out.println("대문자로: " + upperCase);

        // 6. trim() 메서드: 문자열의 앞뒤 공백을 제거합니다.
        String strWithSpaces = "   Java Programming   ";
        String trimmed = strWithSpaces.trim();
        System.out.println("원본: '" + strWithSpaces + "'");
        System.out.println("트림된 문자열: '" + trimmed + "'");

        // 7. equals(Object obj) 메서드: 다른 문자열과의 내용 비교
        String otherStr = "Hello, Java!";
        boolean isEqual = str.equals(otherStr);
        System.out.println("두 문자열이 동일한가? " + isEqual);  // 출력: true

        // 8. indexOf(String str) 메서드: 지정된 문자열의 첫 번째 인덱스를 반환합니다. (찾지 못하면 -1)
        int indexOfJava = str.indexOf("Java");
        System.out.println("'Java'의 첫 번째 인덱스: " + indexOfJava);  // 출력: 7

        // 9. replace(char oldChar, char newChar) 메서드: 문자열 내의 모든 oldChar를 newChar로 대체합니다.
        String replacedStr = str.replace('l', 'X');
        System.out.println("치환된 문자열: " + replacedStr);  // 출력: HeXXo, Java!

    }
}
