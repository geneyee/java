package chap_05;

public class Study506 {
    public static void main(String[] args) {
        // 거스름돈을 몇 개의 동전으로 지불할 수 있는지 계산
        // money의 금액을 동전으로 바꾸었을 때 각각 몇 개의 동전이 필요한지 계산
        // 가능한 한 적은 수의 동전으로 거슬러 주어야 함
        // 나눗셈, 나머지 이용

        // 큰 금액의 동전을 우선적으로 거슬러 줘야 함
        int[] coinUnit = {500, 100, 50, 10};

        int money  = 2680;
        System.out.println("money = " + money);

        for (int i = 0; i < coinUnit.length; i++) {
            System.out.println(coinUnit[i] + "원 : " + money / coinUnit[i]);
            money %= coinUnit[i];
        }
    }
}
