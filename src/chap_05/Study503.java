package chap_05;

public class Study503 {
    public static void main(String[] args) {
        // 배열 모든 값 더하기

        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("sum = " + sum);
    }
}
