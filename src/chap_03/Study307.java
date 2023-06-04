package chap_03;

public class Study307 {
    public static void main(String[] args) {
        int fahrenheit = 100;

        float num = 5 / 9f * (fahrenheit - 32);
        float celsius = (int)(num * 100+0.5f)/100f;

        System.out.println("Fahrenheit : " + fahrenheit);
        System.out.println("Celsius : " + celsius);

        /*
            함수없이 형변환을 이용한 소수점 반올리즘 하는 알고리즘
            소수점 셋째자리에서 반올림 하는 경우
            1. 소수점 둘째자리를 정수부분으로 만들어준다.
            2. 반올림을 위해 +0.5
            3. 정수만 출력 -> int로 형변환
            4. 1번을 다시 되돌리기 위해 나누기 100
         */

    }
}
