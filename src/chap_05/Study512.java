package chap_05;

import java.util.Scanner;

public class Study512 {
    public static void main(String[] args) {
        // 예제 5-23 변경

        String[][] words = {
                {"chair", "의자"},
                {"computer", "컴퓨터"},
                {"integer", "정수"}
        };
        int count = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < words.length; i++) {
            System.out.printf("Q%d. %s의 뜻은? ", i + i, words[i][0]);

            String tmp = scanner.nextLine();



            if (tmp.equals(words[i][1])) {
                System.out.printf("정답입니다.%n%n");
                count++;
            } else {
                System.out.printf("틀렸습니다. 정답은 %s입니다. %n%n", words[i][1]);
            }
        }
        System.out.println("전체 " + words.length + "문제 중 " + count + "문제 맞추셨습니다.");

    }
}
