package chap_06;

class Data2{
    int x;
}
public class Study600_2 {
    public static void main(String[] args) {
        Data2 d = new Data2();
        d.x=10;
        System.out.println("main() : x = "+d.x); //10

        Data2 d1 = new Data2();
        d1.x=20;

        change(d);
        System.out.println("After change(d)");
        System.out.println("main() : x = "+d.x);

    }

    private static void change(Data2 d1) {
        d1.x=1000;
        System.out.println("change() : x = " + d1.x); //1000
    }

}
