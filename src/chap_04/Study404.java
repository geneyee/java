package chap_04;

public class Study404 {
    public static void main(String[] args) {
        // 1+(-2)+3+(-4)+5+(-6)+....+n 100이상 n=?
        int sum = 0;
        int num = 0;

        while(true){
            num++;

            if (num % 2 != 0) {
                sum += num;
            } else {
                sum-=num;
            }
            if(sum>=100){
                System.out.println("num : "+num);
                break;
            }
        }
    }
}
