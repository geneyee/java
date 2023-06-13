package chap_06;

public class Study624 {
    public static int abs(int value) {
        // 주어진 값의 절대값을 반환한다
        return value >= 0 ? value : -value;
    }

    public static void main(String[] args) {
        int value = 5;
        System.out.println(value + "의 절대값 : " + abs(value));
        value = -10;
        System.out.println(value + "의 절대값 : " + abs(value));
    }
}
