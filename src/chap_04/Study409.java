package chap_04;

public class Study409 {
    public static void main(String[] args) {
        // 숫자로 이루어진 문자열 str이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드
        // 만약 문자열이 "1234"라면 1+2+3+4의 결과인 10을 출력

        String str = "1234";
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            // sum+=str.charAt(i);// 202 -> '1'=49.... 49+50+51+52
            sum += str.charAt(i) - '0';
//            sum += str.charAt(i) - 48;
        }
        System.out.println(sum);
    }
}
