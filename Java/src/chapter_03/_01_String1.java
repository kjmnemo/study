package chapter_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);
        // 문자열의 길이
        System.out.println(s.length()); // 29
        // 대소문자 변환
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        // 포함관계
        System.out.println(s.contains("Java")); //true
        System.out.println(s.contains("C#")); //false
        System.out.println(s.indexOf("Java")); // 위치정보 (0~)
        System.out.println(s.indexOf("C#")); // -1 (포함 X)
        System.out.println(s.indexOf("and")); // 처음 일치하는 위치정보
        System.out.println(s.lastIndexOf("and")); // 마지막에 위치하는 위치 정보
        System.out.println(s.startsWith("I like")); // 이 문자열로 시작시 true
        System.out.println(s.endsWith(".")); // 이 문자열로 끝나면 true

    }
}
