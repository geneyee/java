package chap_05;

public class Study509 {
    public static void main(String[] args) {
        // 주어진 배열을 시계방향으로 90도 회전시켜서 출력
        char[][] star = {
                {'*', '*', ' ', ' ', ' '},
                {'*', '*', ' ', ' ', ' '},
                {'*', '*', '*', '*', '*'},
                {'*', '*', '*', '*', '*'}
        };

        char[][] result = new char[star[0].length][star.length];

        for (int i = 0; i < star.length; i++) {
            for (int j = 0; j < star[i].length; j++) {
                System.out.print(star[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        /*
             **
             **
             *****
             *****

             시계방향 90도 회전

             ****
             ****
             **
             **
             **
         */
        for (int i = 0; i < star.length; i++) { // 4
            for (int j = 0; j < star[i].length; j++) { //5
                result[j][i]=star[i][j];
            }
        }

        for (int i = 0; i < result.length; i++) {
            for (int j = result[i].length-1; 0 <= j; j--) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }


    }
}
