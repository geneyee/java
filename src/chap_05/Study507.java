package chap_05;

public class Study507 {
    public static void main(String[] args) {
        // 문제 5-6번에 동전의 개수를 추가한 프로그램
        // 커맨드라인으로부터 거슬러 줄 금액을 입력받아 계산
        // 보유한 동전의 개수로 거스름돈을 지불할 수 없으면 -> 문자 출력 후 종료
        // 지불할 돈이 있으면 -> 거스름돈을 지불한 만큼 가진 돈에서 빼고 남은 동전의 개수 출력

        if (args.length != 1) {
            System.out.println("USAGE : java Exercise5_7 3120");
            System.exit(0);
        }

        // 문자열을 숫자로 변환한다. 입력한 값이 숫자가 아닐 경우 예외가 발생
        int money = Integer.parseInt(args[0]);

        System.out.println("money = " + money);

        int[] coinUnit = {500, 100, 50, 10}; // 동전의 단위
        int[] coin = {5, 5, 5, 5}; // 단위별 동전의 개수

        for (int i = 0; i < coinUnit.length; i++) {
            int coinNum = 0;
            /*
                1. money를 동전단위로 나눠서 필요한 동전의 개수(coinNum)을 구한다.
                2. 배열 coin에서 coinNum만큼의 동전을 뺀다.
                    (만일 충분한 동전이 없다면 배열 coin에 있는 만큼만 뺀다.)
                3. 금액에서 동전의 개수(coinNum)와 동전단위를 곱한 값을 뺀다.
             */
            coinNum = money / coinUnit[i];
            if (coinNum >= 5) {
                money += coinUnit[i] * (coinNum - coin[i]);
                coinNum = 5;
            }
            money %= coinUnit[i];
           //  coin[i] = coin[i] - coinNum;
          //  money = money - (coinNum * coinUnit[i]);
            System.out.println(coinUnit[i] + "원 : " + coinNum);
        }
        if (money > 0) {
            System.out.println("거스름 돈이 부족합니다.");
            System.exit(0);
        }
        System.out.println("= 남은 동전의 개수 =");

        for (int i = 0; i < coinUnit.length; i++) {
            System.out.println(coinUnit[i] + "원 : " + coin[i]);
        }
    }
}
