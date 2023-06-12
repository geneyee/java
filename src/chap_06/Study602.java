package chap_06;

public class Study602 {
    public static void main(String[] args) {
        SutaCard card1 = new SutaCard(3, false);
        SutaCard card2 = new SutaCard();

        System.out.println(card1.info()); // 3
        System.out.println(card2.info()); // 1k
    }
}

