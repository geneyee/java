package chap_04;

public class Study415 {
    public static void main(String[] args) {
        // 회문수 palindrome을 구하는 프로그램
        // palindrome란 숫자를 거꾸로 읽어도 앞으로 읽는 것과 같은 수를 말한다
        // 예를 들면, 12321 13531 같은 수를 말한다
        // 나머지 연산자를 이용해서 풀기

        int number = 12321;
        int tmp = number;

        int result = 0; // 변수 number를 거꾸로 변환해서 담을 변수

        while (tmp != 0) {
            result = (tmp % 10) + (result * 10);
            tmp /= 10;
            System.out.println(result);
        }
        if (number == result) {
            System.out.println(number + "는 회문수 입니다.");
        } else {
            System.out.println(number + "는 회문수가 아닙니다.");
        }


    }
}
