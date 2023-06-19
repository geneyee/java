package chap_07;

public class Study717 {
}
class Marine extends Unit {
    Marine(){
        super();
    }

    @Override
    void move(int x, int y) {

    }

    void strimPack() {/* 스팀팩을 사용 */}
}
class Tank extends Unit {
    Tank(){
        super();
    }

    @Override
    void move(int x, int y) {

    }

    void changeMode() {/* 공격모드를 변환 */}
}
class Dropship extends Unit {
    Dropship(){
        super();
    }

    @Override
    void move(int x, int y) {

    }

    void load() {/* 선택된 대상을 태움 */}
    void unload() {/* 선택된 대상을 내림 */}
}
abstract class Unit {
    int x;
    int y;

    Unit() {
        this(3,5);
    }

    Unit(int x, int y) {
        this.x = x;
        this.y = y;
    }

    abstract void move(int x, int y); // 추상클래스
    void stop() {/* 현재 위치에 정지 */}
}
