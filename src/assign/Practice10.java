package assign;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice10 {

    public static void main(String[] args) {

        // 변수 및 배열 선언
        int num = 0;
        char[] day = {'일', '월', '화', '수', '목', '금', '토'};
        Scanner sc = new Scanner(System.in);

        // 정수 입력받기 및 예외처리
        while(true) {
            try {
                System.out.print("정수를 입력 >> ");
                num = sc.nextInt();
                break;
            }
            catch(InputMismatchException e1) {
                System.out.println("경고! 정수로 입력하지 않았다.");
                sc.next();
            }
        }
        sc.close();

        // 음수가 입력되었을 때 프로그램을 종료함(예외처리)
        // 올바른 입력에는 알맞은 값을 출력
        try {
            int index = num % 7;
            System.out.println(day[index]);
        }
        catch(ArrayIndexOutOfBoundsException e2) {
            System.out.println("프로그램을 종료합니다.");
            System.exit(0);
        }

    }

}
