package chap_06;

class Marine {
    int x = 0, y = 0; // Marine의 위치좌표(x,y)
    int hp = 60; // 현재 체력
    static int weapon = 6; // 공격력
    static int armor = 0; // 방어력

    void weaponUp() {
        weapon++;
    }
    void armorUp() {
        armor++;
    }

    void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class Study609 {
    // 컴퓨터 게임의 병사(marine)를 클래스로 정의한 것이 class Marine
    // 모든 병사의 공격력과 방어력은 같다고 할 때
    // 이 중에 static을 붙여야 하는 것은?
    // -> static int weapon, static int armor
    // 그 이유는 -> 모든 병사의 공격력과 벙어력이 같기 때문에
    /*
        그런데 void weaponUp(), void armorUp()는 static 꼭 안붙여도 되는거 아닐까?
        처음 공격력과 방어력은 같고 그 후에는 각자 병사마다 달라진다고 하면 static 필요 없는거 아닐지
        그리고  void weaponUp(), void armorUp()는 인스턴스 메서드니까 static 변수 사용가능하니까
        코드상 문제도 없어보이고

        https://cafe.naver.com/javachobostudy/106297
        static변수는 static 메서드로 다루는 것이 일반적이다.
        어떤 메서드가 있을 때, 그 메서드 내에서 인스턴스 변수를 쓰니까 인스턴스 메서드 인 것이고
        (안써도 개념상 인스턴스 메서드로 할 수 있지만)
        마찬가지로 static 메서드도 static 변수를 내부에서 사용하니까 static 메서드 인 것.

        p.182 4번 참고
        클래스 메서드(static 메서드)의 호출시간이 인스턴스 메서드보다 짧기 때문에
        static을 붙여 줄 수 있으면 붙여주는게 좋다. 호출시간이 짧아지는 이유는 인스턴스 메서드의 경우
        실행 시 호출되어야 할 메서드를 찾는 과정이 추가적으로 필요하기 때문

     */}
