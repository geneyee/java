package chap_04;

public class Study411 {
    public static void main(String[] args) {
        // 피보나치 수열은 앞 두 수를 더해서 다음 수를 만들어 나가는 수열
        // 예를 들어 앞의 두 수가 1과 1이라면 다음 수는 2가 되고 그 다음 수는 1+2+3
        // 1,1,2,3,5,8,13,21...
        // 1과 1부터 시작하는 피보나치 수열의 10번째 수는?

        // Fibonnaci 수열의 시작 첫 두 숫자를 1,1로 한다.
        int num1 = 1;
        int num2 = 1;
        int num3 = 0;

        System.out.print(num1 + "," + num2);

        for (int i = 0; i < 8; i++) {
            num3=num1+num2;
            System.out.print(","+num3);
            num1 = num2;
            num2 = num3;
        }
    }
}
