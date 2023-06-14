package chap_07;

public class Study702 {
    // 701 SutaDeck 클래스에 새로운 메서드 추가하고 테스트하기
    public static void main(String[] args) {
        SutaDeck deck = new SutaDeck();

        System.out.println(deck.pick(0)); // 1k
        System.out.println(deck.pick()); // 7

        deck.shuffle();
        for (int i = 0; i < deck.cards.length; i++) {
            System.out.print(deck.cards[i] + ",");
        }
        System.out.println();

        System.out.println(deck.pick(0)); // 2

    }
}
