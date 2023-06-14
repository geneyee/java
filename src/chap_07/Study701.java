package chap_07;
// 섯다카드 20장을 포함하는 섯다카드 한 벌(SutaDeck 클래스)를 정의
// 섯다카드 20장을 담는 SutaCard배열을 초기화
// 단, 섯다카드는 1부터 10까지의 숫자가 적힌 카드가 1장식 있고 숫자가 1,3,8인 경우는 둘 중 한장은 광(Kwang)
// 즉, SutaCard의 인스턴스 변수 isKwang의 값이 true여야 한다.
public class Study701 {
    public static void main(String[] args) {
        SutaDeck deck = new SutaDeck();

        for (int i = 0; i < deck.cards.length; i++) {
            System.out.print(deck.cards[i] + ", ");
        }
    }
}

class SutaDeck {

    final int CARD_NUM = 20;
    SutaCard[] cards = new SutaCard[CARD_NUM];

    SutaDeck() {
        for (int i = 0; i < CARD_NUM; i++) {
            // 1. 카드 20장 넣기
            // 2. num은 1 ~ 10
            int num = i % 10 + 1;
            // 3. isKwang true 만들어주기
            boolean isKwang = (i < 10) && (num == 1 || num == 3 || num == 8);
            cards[i] = new SutaCard(num, isKwang);
        }
    }

    // 배열 cards에 담긴 카드의 위치 섞기
    void shuffle() {
        for (int i = 0; i < cards.length; i++) {
            int x = (int) (Math.random() * cards.length);

           SutaCard tmp = cards[i];
           cards[i] = cards[x];
           cards[x] = tmp;
        }
    }

    // 배열 cards에서 지정된 위치의 SutaCard를 반환
    public SutaCard pick(int index) {
        return cards[index];
    }

    // 배열 cards에서 임의의 위치의 SutaCard를 반환
    public SutaCard pick(){
        int index = (int) (Math.random() * cards.length);
        return cards[index];
    }
}

class SutaCard {
    int num;
    boolean isKwang;

    SutaCard(){
        this(1, true);
    }

    SutaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    @Override
    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}