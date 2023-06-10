package chap_05;

import java.util.Scanner;

public class Study513 {
    public static void main(String[] args) {
        // 단어의 글자위치를 섞어서 보여주고 원래의 단어를 맞추기

        String[] words = {"television", "computer", "mouse", "phone"};

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < words.length; i++) {
            char[] question = words[i].toCharArray(); // String을 char[]로 변환

            // question -> words[i] -> 'm' 'o' 'u' 's' 'e' ->  순서 랜덤
//            for (int j = 0; j < question.length; j++) {
//                question[j]=question[(int)(Math.random()*question.length)];
//            } //veovooovvv의 정답을 입력하세요. xxxx

            for (int j = 0; j < question.length; j++) {
                int x = (int) (Math.random() * question.length); // 인덱스 랜덤
                char tmp = 0;

                tmp = question[0];
                question[0] = question[x];
                question[x] = tmp;

            }

            System.out.printf("Q%d. %s의 정답을 입력하세요. > ", i + 1, new String(question));

            String answer = scanner.nextLine();

            // trim()으로 answer의 좌우 공백을 제거한 후 , equals로 word[i]와 비교
            if (words[i].equals(answer.trim())) {
                System.out.printf("맞았습니다.%n%n");
            } else {
                System.out.printf("틀렸습니다.%n%n");
            }
        }
    }
}
