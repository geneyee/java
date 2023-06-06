package chap_03;
//연산자(Operator)
public class Study301 {
    public static void main(String[] args) {

        // 3-1
        int x = 2;
        int y = 5;
        char c = 'A'; // 65

        System.out.println(1 + x << 33); // 6
        /*
         << : 비트(shift) 연산자
         33번 왼쪽으로 쉬프트 한다.
         그런데 int는 4byte = 32bit
         3 << 33
         00000000 00000000 00000000 00000011
         이것을 왼쪽으로 33번 쉬프트 -> 33-32 해서 결국 1번만 쉬프트
         00000000 00000000 00000000 00000110
         -> 6
         */

        System.out.println(y >= 5 || x < 0 && x > 2); // t
        /*
            논리연산자의 우선순위
            && > ||
         */

        System.out.println(y += 10 - x++); // y = y+10- x++
        System.out.println(x += 2);
        System.out.println('C' - c);
        System.out.println('5' - '0'); // 53 - 48
        System.out.println(c + 1);
        System.out.println(++c);
        System.out.println(c++);
        System.out.println(c);

    }
}
