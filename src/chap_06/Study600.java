package chap_06;

public class Study600 {
    public static void main(String[] args) {
        // 두 값을 받아서 둘 중에 큰 값을 반환하는 메서드
        System.out.println(max(3,5));

        int result = max(6, 5);
        System.out.println(result);

        System.out.println("----------------------");

        //minimum
        System.out.println(min(3, 5));

        int result2 = min(6, 5);
        System.out.println(result2);

    }

    public static int max(int x, int y) {
        int result =  x > y ? x : y;
        return result;
    }

    public static int min(int x, int y) {
        return x < y ? x : y;
    }
}
