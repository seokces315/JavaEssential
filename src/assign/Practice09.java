package assign;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice09 {

    public static void main(String[] args) {

        // 변수 초기화 및 선언
        int num = 0;
        Scanner sc = new Scanner(System.in);

        // 정수 입력 받기 및 예외처리
        System.out.print("정수를 입력하세요 >> ");
        try {
            num = sc.nextInt();
        }
        catch(InputMismatchException e) {
            System.out.println("정수로 입력하지 않아 프로그램을 종료합니다.");
            System.exit(0); //프로그램 종료
        }
        sc.close();

        // 홀짝 판별
        if(num % 2 == 0) {
            System.out.println("짝수");
        }
        else {
            System.out.println("홀수");
        }

    }

}
