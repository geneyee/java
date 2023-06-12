package chap_06;

public class Study606 {
    public static void main(String[] args) {
        // 두 점 (x,y)와 (x1,y1)사이의 거리 구하기
        System.out.println(getDistance(1, 1, 2, 2)); // 1.4142135....
    }

    private static double getDistance(int x, int y, int x1, int y1) {
        double result = ((x1-x)*(x1-x))+((y1-y)*(y1-y));
        return Math.sqrt(result);
    }
}
