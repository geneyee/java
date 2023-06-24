package chap_07;

public class Study719 {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new Tv1());
        b.buy(new Computer());
        b.buy(new Tv1());
        b.buy(new Audio());
        b.buy(new Computer());
        b.buy(new Computer());
        b.buy(new Computer());

        b.summary();
    }
}

class Buyer {
    int money = 1000;
    Product1[] cart = new Product1[3];
    int i = 0;

    void buy(Product1 p) {
        if (money < p.price) {
            System.out.println("잔액이 부족하여 " + p + "을/를 살 수 없습니다.");
            return;
        } else {
            money -= p.price;
            add(p);
        }
    }

    void add(Product1 p) {
        if (i >= cart.length) {
            Product1[] cart2 = new Product1[cart.length * 2];
            for (int j = 0; j < cart.length; j++) {
                cart2[j] = cart[j];
            }
            cart = cart2;
        }
        cart[i] = p;
        i++;
    }

    void summary() {
        int sum = 0;
        System.out.print("구입한 물건 : ");
        for (int j = 0; j < cart.length; j++) {
            System.out.print(cart[j] + " ");
            sum += cart[j].price;
        }
        System.out.println("\n사용한 금액 : " + sum);
        System.out.println("남은 금액 : " + money);
    }
}

class Product1 {
    int price;

    Product1(int price) {
        this.price = price;
    }
}

class Tv1 extends Product1 {
    Tv1() {
        super(100);
    }

    public String toString() {
        return "TV";
    }
}

class Computer extends Product1 {
    Computer() {
        super(200);
    }

    public String toString() {
        return "Computer";
    }
}

class Audio extends Product1 {
    Audio() {
        super(50);
    }

    public String toString() {
        return "Audio";
    }
}

