package chap_07;

public class Study704 {
    // Q. 다음 중 오버라이딩의 조건으로 옳지 않은 것은?
    // 1. 조상의 메서드와 이름이 같아야 한다. o
    // 2. 매개변수의 수와 타입이 모두 같아야 한다. o
    // 3. 접근 제어자는 조상의 메서드보다 좁은 범위로만 변경할 수 있다. o
    // 4. 조상의 메서드보다 더 많은 수의 예외를 선언할 수 있다. x

    // 해설
    // 3 4 x
    // 3. 접근 제어자는 조상클래스의 메서드보다 좁은 범위로 변경할 수 없다.
    // 4. 조상 클래스의 메서드보다 많은 수의 예외를 선언할 수 없다.
    // 추가) 인스턴스 메서드를 static 메서드로 또는 그 반대로 변경할 수 없다.
}
