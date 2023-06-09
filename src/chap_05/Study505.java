package chap_05;

import java.util.Arrays;

public class Study505 {
    public static void main(String[] args) {
        // 1 ~ 9 사이의 중복되지 않은 숫자로 이루어진 3자리 숫자 프로그램

        int[] ballArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] ball3 = new int[3];


        // 배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다.
        for (int i = 0; i < ballArr.length; i++) {
            int j = (int) (Math.random() * ballArr.length); // 0 ~ 9
            int tmp = 0;

            tmp = ballArr[i];
            ballArr[i] = ballArr[j];
            ballArr[j] = tmp;
        }
        System.arraycopy(ballArr, 0, ball3, 0, 3);

        for (int i = 0; i < 3; i++) {
            System.out.print(ball3[i]);
        }
    }
}
