package chap_06;

public class Study616 {
    /*
        Q. 다음 중 지역변수에 대한 설명으로 옳지 않은 것은?
        1. 자동 초기화 되므로 별도의 초기화가 필요없다. X
        2. 지역변수가 선언된 메서드가 종료되면 지역변수도 함께 소멸된다. O
        3. 매서드의 매개변수로 선언된 변수도 지역변수이다. O
        4. 클래스변수나 인스턴스변수보다 메모리 부담이 적다. X
        5. 힙(heap)영역에 생성되며 가비지 컬렉터에 의해 소멸된다. O

        정답
        1. X
        -> 지역변수는 자동초기화 되지 않으므로 수동 초기화가 필수적이다.

        2. O

        3. O

        4. O
        -> 지역변수의 생명주기가 짧으므로(메서드 종료시 소멸) 메모리 부담이 적다.

        5. X
        -> 힙영역에는 인스턴스(인스턴스 변수)가 생성되는 영역이며, 지역변수는 호출스택 call stack에 생성된다.
     */
}