package chap_05;

public class Study511 {
    public static void main(String[] args) {
        // 주어진 2차원 배열의 데이터보다 가로와 세로로 1이 더 큰 배열을 생성해서
        // 배열의 행과 열의 마지막 요소에 각 열과 행의 총 합을 저장하고 출력

        int[][] score = {
                {100, 100, 100},
                {20, 20, 20},
                {30, 30, 30},
                {40, 40, 40},
                {50, 50, 50}
        };

        // 1. [5][3] -> [6][4]
        // 2-1. [0][3] [1][3] [2][3] [3][3] [4][3] [5][3]
        // 2-2. [5][0] [5][1] [5][2] [5][3]

        // 1
        int[][] result = new int[score.length + 1][score[0].length + 1];

        int sum = 0;

        // 2
        for (int i = 0; i < score.length; i++) { //5
            for (int j = 0; j < score[i].length; j++) { //3
                result[i][j] = score[i][j];
                // 2-1
                result[i][score[i].length] += score[i][j];
                // 2-2
                result[score.length][j] += score[i][j];
                // 2-3
                result[score.length][score[i].length] += score[i][j];

            }
        }

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }
}
