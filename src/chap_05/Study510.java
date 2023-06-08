package chap_05;

public class Study510 {
    public static void main(String[] args) {
        // 알파벳 숫자 채워넣기 (책 참고)

        char[] abcCode = {
                '`', '~', '!', '@', '#', '$', '%', '^', '&', '*',
                '(', ')', '-', '_', '+', '=', '|', '[', ']', '{',
                '}', ';', ':', ',', '.', '/'
        };
        char[] numCode = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'};
        // 0 1 2 3 4 5 6 7 8 9

        String src = "abc123";
        String result = "";

        // 문자열 src의 문자를 charAt()으로 하나씩 읽어서 벼환
        for (int i = 0; i < src.length(); i++) {
            char ch = src.charAt(i);
            if ('a' <= ch && ch <= 'z') {
                result += abcCode[ch - 'a'];
            } else if ('0' <= ch && ch <= '9') {
                result += numCode[ch - '0'];
            }
        }

        System.out.println("src : " + src); // src : abc123
        System.out.println("result : " + result); // result : `~!wer
    }
}
