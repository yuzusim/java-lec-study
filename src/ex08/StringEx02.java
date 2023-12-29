package ex08;

public class StringEx02 {
    public static void main(String[] args) {
        String text = "Java Programming";

        // 1. indexOf(String str) 메서드: 문자열에서 지정된 문자열의 첫 번째 인덱스를 반환합니다. (찾지 못하면 -1)
        int indexOfJava = text.indexOf("Java");
        System.out.println("첫 번째 'Java'의 인덱스: " + indexOfJava);  // 출력: 0

        // 2. lastIndexOf(String str) 메서드: 문자열에서 지정된 문자열의 마지막 인덱스를 반환합니다. (찾지 못하면 -1)
        int lastIndexOfJava = text.lastIndexOf("Java");
        System.out.println("마지막 'Java'의 인덱스: " + lastIndexOfJava);  // 출력: 5

//        // lastIndexOf(String str) 메서드: 문자열에서 지정된 문자열의 마지막 인덱스를 반환합니다. (찾지 못하면 -1)
//        int lastIndexOfJava = text.lastIndexOf("Java");
//        System.out.println("마지막 'Java'의 인덱스: " + lastIndexOfJava);  // 출력: 19


        // 3. contains(CharSequence sequence) 메서드: 문자열에 지정된 문자열이 포함되어 있는지 여부를 반환합니다.
        boolean containsJava = text.contains("Java");
        System.out.println("문자열에 'Java'가 포함되어 있나? " + containsJava);  // 출력: true

        // 4. startsWith(String prefix) / endsWith(String suffix) 메서드: 접두사 또는 접미사 여부를 확인합니다.
        boolean startsWithJava = text.startsWith("Java");
        boolean endsWithProgramming = text.endsWith("Programming");
        System.out.println("문자열이 'Java'로 시작하는가? " + startsWithJava);  // 출력: true
        System.out.println("문자열이 'Programming'로 끝나는가? " + endsWithProgramming);  // 출력: true

        // 5. replace(CharSequence target, CharSequence replacement) 메서드: 지정된 문자열을 새로운 문자열로 대체합니다.
        String replacedText = text.replace("Java", "Python");
        System.out.println("치환된 문자열: " + replacedText);  // 출력: Python Programming

        // 6. split(String regex) 메서드: 지정된 정규식을 기준으로 문자열을 분할하여 배열로 반환합니다.
        String[] words = text.split(" ");
        System.out.println("문자열 분할:");
        for (String word : words) {
            System.out.println(word);
        }

        // 7. concat(String str) 메서드: 현재 문자열에 지정된 문자열을 추가하여 새로운 문자열을 생성합니다.
        String addedText = text.concat(" Language");
        System.out.println("추가된 문자열: " + addedText);

        // 8. matches(String regex) 메서드: 정규식과 문자열이 일치하는지 여부를 반환합니다.
        boolean matchesRegex = text.matches(".*Programming.*");
        System.out.println("정규식과 일치하는가? " + matchesRegex);  // 출력: true

    }
}
