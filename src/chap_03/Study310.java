package chap_03;

public class Study310 {
    public static void main(String[] args) {
        char ch = 'C';
        char lowerCase = ch < 97 ? (char) (ch + 32) : ch;

        System.out.println("ch : " + ch);
        System.out.println("ch to lowerCase : " + lowerCase);
    }
}
