package chap_07;

public class Study720 {
    public static void main(String[] args) {
        Parent1 p = new Child1();
        Child1 c = new Child1();

        System.out.println("p.x = " + p.x); // 100
        p.method(); // Child Method
        System.out.println("c.x = " + c.x); // 200
        c.method(); // Child Method

        /*
        * 조상 클래스에 선언된 멤버변수와 같은 이름의 인스턴스 변수를 자손 클래스에 중복 정의했을 때
        * int x -> p.x / c.x 는 다른 결과 나옴
        * 메서드의 경우 조상 클래스의 메서드를 자손 클래스에서 오버라이딩 한 경우에도 참조변수의 타입에 관계없이
        * 항상 실제 인스턴스의 메서드(오버라이딩 된 메서드)가 호출되지만,
        * 멤버변수의 경우 참조변수의 타입에 따라 달라진다.
        *
        * 타입은 다르지만 참조변수 p,c 모두 Child 인스턴스를 참조하고 있다.
        * 그리고 Parent 클래스와 Child 클래스는 서로 같은 멤버(int x)를 정의하고 있다.
        * 이 때 조상타입의 참조변수 p로 Child 인스턴스의 멤버들을 사용하는 것과
        * 자손타입의 참조변수 c로 Child 인스턴스의 멤버들을 사용하는 것의 차이를 알 수 있다.
        *
        * 메서드인 method()의 경우 참조변수의 타입에 관계없이
        * 항상 실제 인스턴스의 타입인 Child 클래스에 정의된 메서드가 호출되지만,
        * 인스턴스 변수인 x는 참조변수의 타입에 따라서 달라진다.
        * */

    }
}
class Parent1 {
    int x = 100;

    void method(){
        System.out.println("Parent Method");
    }
}

class Child1 extends Parent1 {
    int x = 200;

    void method(){
        System.out.println("Child Method");
    }
}