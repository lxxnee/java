package Edu;

public class ControlStatement {
    public static void main(String[] args) {
//            if(true) {
//                // 처리 코드
//            } else if(조건2) {
//                // 처리코드
//            } else {
//                // 처리코드
//            }

        // swith 문
        String food = "닭칼";
        switch (food) {
            case "김밥" :
                System.out.println("분식");
                break;
            case "닭칼" :
                System.out.println("국수");
                break;
            case "뚝배기" :
                System.out.println("한식");
                break;
            default:
                System.out.println("기타");
                break;
        }

        // for 문
        for(int i = 0; i < 3; i++) {
            if( i == 1) {
                continue;
            }
            System.out.println(i);
        }

        // 구구단
        for(int i = 2; i < 10; i++) {
            for(int j = 1; j < 10; j++) {
                System.out.printf("%d X %d = %d%n", i, j, i * j);
            }
        }

        //      *
        //     **
        //    ***
        //   ****
        //  *****
        int n = 5;

        for (int i = 1; i <= n; i++) {
            // 공백 출력
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }

            // 별 출력
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }


            System.out.println();
        }

        int cnt = 5;
        for (int i = 0; i < cnt; i++) {
            for (int j = i; j < (cnt - 1); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
