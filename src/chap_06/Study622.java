package chap_06;

public class Study622 {
    public static boolean isNumber(String str) {
        boolean result = false;
        
        for (int i = 0; i < str.length(); i++) {
            if ('0' <= str.charAt(i) && str.charAt(i) <= '9') {
                result = true;
            } else if (!('0' <= str.charAt(i) && str.charAt(i) <= '9')) {
                result = false;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String str = "123";
        System.out.println(str + "는 숫자입니까? " + isNumber(str));

        str = "1234o";
        System.out.println(str + "는 숫자입니까? " + isNumber(str));
    }
}
