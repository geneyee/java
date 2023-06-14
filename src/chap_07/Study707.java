package chap_07;

class Parent {
    int x = 100;

    Parent() {
        this(200);
    }
    Parent(int x) {
        this.x = x;
    }
    int getX() {
        return x;
    }
}

class Child extends Parent {
    int x = 3000;

    Child() {
        this(1000);
    }

    Child(int x) {
        this.x = x;
    }

}
public class Study707 {
    public static void main(String[] args) {
        Child c = new Child();
        System.out.println("x = " + c.getX());
    }

}
// Q. 코드를 실행했을 때 호출되는 생성자의 순서와 실행결과는?
// Child() -> Child(int x) ->  Parent() -> Parent(int x) -> Object()
// c.getX() = 200 Parent의 x