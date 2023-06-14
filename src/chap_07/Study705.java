package chap_07;

class Product {
    int price;      // 제품의 가격
    int bonusPoint; // 제품 구매시 제공하는 보너스 점수

     Product(){}

    Product(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }
}

class Tv extends Product {
    Tv() {
        // 생성자의 첫 줄에는 반드시 생성자를 호출해야한다
        // 아무것도 없으므로 super();를 호출한다.
        // Product 클래스에 Product(){}생성자가 존재하지 않으므로 컴파일 에러
        // 해결방법 -> class Product에 Product(){}생성자를 추가한다.
    }

    public String toString() {
        return "Tv";
    }
}

public class Study705 {
    public static void main(String[] args) {
        Tv t = new Tv();
    }
}
