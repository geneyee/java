package chap_06;

class Mypoint {
    int x;
    int y;

    Mypoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getDistance(int x, int y) {
        double result = ((x-this.x)*(x-this.x))+((y-this.y)*(y-this.y));
        return Math.sqrt(result); // 제곱근
    }
}
public class Study607 {
    public static void main(String[] args) {
        Mypoint p = new Mypoint(1, 1);

        System.out.println(p.getDistance(2,2));
    }
}
