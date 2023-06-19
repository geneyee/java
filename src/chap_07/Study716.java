package chap_07;

public class Study716 {
    public static void main(String[] args) {
        FireEngine fe = new FireEngine();

        if(fe instanceof FireEngine)
            System.out.println("1 ok");
//        if (fe instanceof Movable) - 인터페이스도 true
            System.out.println("2 ok");
        if (fe instanceof Object)
            System.out.println("3 ok");
        if (fe instanceof Car)
            System.out.println("4 ok");
//        if (fe instanceof Ambulance) false
            System.out.println("5 ok");
    }
}
class Car {}
class FireEngine extends Car {} // implements Movable {}
class Ambulance extends Car {}
