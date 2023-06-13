package chap_06;

public class Study618 {
    // Q. 컴파일 에러가 발생하는 라인과 그 이유 설명
    // A : static 변수 초기화에 인스턴스 변수 사용 x (초기화 시점 생각하면..) 인스턴스 생성(객체 생성 후)는 가능
    // B : static 메서드에 인스턴스 변수 사용 x
    // C : 에러없음 -> 인스턴스 메소드에 인스턴스 변수 사용 가능
    // D : static 메서드에 인스턴스 메서드 호출 X
    // E : 에러없음 -> 인스턴스 메서드에서 static 메서드 호출 가능
}

class MemberCall {
    int iv = 10;
    static int cv = 20;

    int iv2 = cv;
//    static int cv2 = iv; // 라인 A

    static void staticMethod1 () {
        System.out.println(cv);
//        System.out.println(iv);  // 라인 B
    }

    void instanceMethod1 () {
        System.out.println(cv);
        System.out.println(iv);  // 라인 C
    }

    static void staticMethod2 () {
        staticMethod1();
//        instanceMethod1(); // 라인 D
    }

    void instanceMethod2 () {
        staticMethod1();    // 라인 E
        instanceMethod1();
    }


}