package chapter02;  // 패키지 선언

public class CharacterEx1 {  // CharacterEx1 클래스 정의
    public static void main(String[] args) {  // 메인 메소드 시작
        char ch1 = 'A';  // char 타입 변수 ch1에 문자 'A' 할당
        System.out.println(ch1);  // ch1 값 출력 (결과: A)
        System.out.println((int)ch1);  // ch1을 int로 형변환하여 출력 (결과: 65)
        System.out.println("=================================");  // 구분선 출력

        char ch2 = 66;  // char 타입 변수 ch2에 정수 66 할당 (ASCII 코드에서 'B'에 해당)
        System.out.println(ch2);  // ch2 값 출력 (결과: B)
        System.out.println("=================================");  // 구분선 출력

        int ch3 = 67;  // int 타입 변수 ch3에 정수 67 할당 (ASCII 코드에서 'C'에 해당)
        System.out.println(ch3);  // ch3 값 출력 (결과: 67)
        System.out.println((char)ch3);  // ch3를 char로 형변환하여 출력 (결과: C)
    }  // 메인 메소드 종료
}  // CharacterEx1 클래스 종료
