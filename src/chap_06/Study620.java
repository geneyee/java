package chap_06;

public class Study620 {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(java.util.Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));

    }
    private static int[] shuffle(int[] original) {
        // 주어진 배열에 담긴 값의 위치를 바꾸는 작업을 반복하여 뒤섞이게 한다.
        // 처리한 배열을 반환한다.
        for (int i = 0; i < original.length; i++) {
            int n = (int) (Math.random() * original.length); // 0 ~ 8 인덱스번호

            int tmp = 0;

            tmp = original[i];
            original[i] = original[n];
            original[n] = tmp;
        }
        return original;
    }
}
