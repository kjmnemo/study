package chapter_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        // 특수문자, 이스케이프 문자(Escape Sequence, Escape Character, Special Character)
        System.out.println("Jave");
        System.out.println("too");
        System.out.println("funny");

        // \n : 줄바꿈
        System.out.println("Java\ntoo\nfunny");

        // \t : tab
        System.out.println("a\t100");
        System.out.println("b\t200");
        System.out.println("c\t\t300");

        // \\ : \
        System.out.println("C:\\Program Files\\Java");

        // \" : "
        System.out.println("cat say \"meow\"");

        // \' : '
        System.out.println("dog say \'bow\'");
        System.out.println("dog say 'bow'");

        char c = 'A';
        c = '\'';
        System.out.println(c);

    }

}
