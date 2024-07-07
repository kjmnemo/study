package chapter_01;

public class _05_VariableNaming {
    // 변수이름 짓는 법
    // 1. 저장할 값에 어울리는 값
    // 2. 밑줄, 문자, 숫자 사용 가능 (공백 사용 불가)
    // 3. 밑줄 또는 문자로 시작 가능
    // 4. 한 단어 또는 2개 이상 단어의 연속
    // 5. 소문자로 시작, 각 단어의 시작 글자는 대문자(첫 단어는 제외)
    // 6. 예약어 설명 불가 (public, state, void, int, double, float)

    // 입국 신고서(여행)
    String Nationality = "대한민국";
    String firstName = "sean";
    String lastName = "kw";
    String deathOfBirt = "20011212";
    String residentialAddress = "Hotel";
    String purposeOfVisit = "travel";
    String flightNo = "KE";
    String _flightNo = "KE";
    String flight_no_2 = "KE";// 밑줄과 숫자 포함
    // String -flightNo = "kE"
    int accompany = 2 ;
    int lengthOfStay = 5;
    String item1 = "watch";
    String item2 = "couch";
    // 절대 변하지 않는 상수는 대문자로
    final String CODE = "KR";

}
