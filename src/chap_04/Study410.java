package chap_04;

public class Study410 {
    public static void main(String[] args) {
        // int타입의 변수 num이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드
        // 만약 num의 값이 12345라면 1+2+3+4+5 = 15 출력
        // 문자열로 변환하지 않고 숫자로만 처리

        int num = 12345;
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        System.out.println("sum = " + sum);
    }
}
