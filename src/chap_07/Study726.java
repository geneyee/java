package chap_07;

public class Study726 {
    public static void main(String[] args) {
        Outer2.Inner inner = new Outer2.Inner();
        System.out.println(inner.iv);
    }
}
class Outer2 {
    static class Inner {
        int iv = 200;
    }
}