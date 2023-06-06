package chap_04;

public class Study403 {
    public static void main(String[] args) {
        // 1+ (1+2) + (1+2+3) + ... + (1+2+3+4+5+6+7+8+9+10)
        int sum=0;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                sum+=j;
            }
        }
        System.out.println(sum);

    }
}
