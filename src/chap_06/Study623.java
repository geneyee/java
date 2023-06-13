package chap_06;

public class Study623 {
    public static int max(int[] arr) {
        // 주어진 int 배열에서 제일 큰 값 반환
        // 만약 배열이 null이거나 크기가 0인 경우 -999999를 반환한다.

        if (arr == null || arr.length == 0) {
            return -99999;
        }

        int maxNum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxNum) {
                maxNum = arr[i];
            }
        }
        return maxNum;
    }

    public static void main(String[] args) {
        int[] data = {3, 2, 9, 4, 7};
        System.out.println(java.util.Arrays.toString(data));
        System.out.println("최대값 : " + max(data));
        System.out.println("최대값 : " + max(null));
        System.out.println("최대값 : " + max(new int[]{})); // 크기가 0인 배열
    }
}
