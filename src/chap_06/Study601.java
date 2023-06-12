package chap_06;

public class Study601 {
        // 다음과 같은 멤버변수를 갖는 SutaCard 클래스 정의
        // int num -> 카드의 숫자. (1~10사이의 정수)
        // boolean isKwang -> 광이면 true, 아니면 false
}

class SutaCard {
    private int num; //0
    private boolean isKwang; //false

    public SutaCard(){
        num = 1;
        isKwang = true;
    }

    public SutaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    String info() {
        return num + (isKwang ? "k" : "");
    }

}
