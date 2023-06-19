package chap_07;

// Q. 문제 7-1에 나오는 섯다카드의 숫자와 종류는 값이 변경되어서는 안되는 값이다.
// 카드의 숫자가 한 번 잘못 바뀌면 똑같은 카드가 두장이 될 수도 있기때문이다.
// 이러한 문제점이 발생하지 않도록 아래의 SutaCard를 수정

class SutaCard1 {
//    int num;
    final int num;
//    boolean isKwang;
    final boolean isKwang;

    SutaCard1() {
        this(1, true);
    }

    SutaCard1(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}

public class Study714 {
    public static void main(String[] args) {
        SutaCard1 card = new SutaCard1(1, true);
    }
}
