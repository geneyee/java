package chap_04;

public class Study401 {
    public static void main(String[] args) {
        int x = 10;
        boolean b1 = x > 10 && x < 20;

        char a = 'A';
        boolean b2 = a!=' ' || a!='\t';

        char c = 'C';
        boolean b3 = c == 'x' || c == 'X';

        char ch = 0;
        // boolean b4 = c >= 48 && c <= 57;
        boolean b4 = c >= 0 && c <= 9;

        ch = 'a';
        System.out.println((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'));

        int year = 2000;
        System.out.println(year % 400 == 0 || year % 4 == 0 && year % 100 !=0);

        boolean powerOn = false;
        System.out.println(!powerOn);

        String str = "yes";
        System.out.println(str.equals("yes"));

    }
}
