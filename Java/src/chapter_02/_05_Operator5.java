package chapter_02;

public class _05_Operator5 {
    public static void main(String[] args) {
        // 삼항 연산자
        // 결과 = (조건) ? (참의 경우 결과값) : (거짓의 경우 결과값)
        int x = 5;
        int y = 3;
        int max = (x > y) ? x : y;
        System.out.println(max);

        int min = (x<y) ? x:y ;
        System.out.println(min);

        boolean b = (x==y) ? true : false;
        System.out.println(b); //false

        String s= (x != y) ? "diff" : "same" ;
        System.out.println(s);


    }
}
