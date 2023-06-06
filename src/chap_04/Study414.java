package chap_04;

import java.util.Scanner;

public class Study414 {
    public static void main(String[] args) {
        // 숫자 맞추기 게임
        // 1과 100사이의 값을 반복적으로 입력해서 컴퓨터가 생각한 값을 맞추면 게임 끝
        // 사용자가 값을 입력하면, 컴퓨터는 자신이 생각한 값과 비교해서 값을 알려준다
        // 사용자가 컴퓨터가 생각한 숫자를 맞추면 게임이 끝나고 몇 번만에 숫자를 맞췄는지 알려준다

        // 1~100 사이의 임의의 값을 얻어서 answer에 저장
        int answer = (int)(Math.random()*100)+1;
        int input = 0; // 사용자입력 저장
        int count = 0; // 시도횟수

        //사용자 입력
        Scanner s = new Scanner(System.in);

        do{
            count++;
            System.out.print("1과 100 사이의 값을 입력하세요 : ");
            input = s.nextInt();

            if (input == answer) {
                System.out.println("맞췄습니다.");
                System.out.println("시도 횟수는 " + count + "번 입니다.");
                break;
            } else if (input < answer) {
                System.out.println("더 큰 수를 입력하세요.");
            } else if (input > answer) {
                System.out.println("더 작은 수를 입력하세요.");
            }
        } while (true);
    }
}
