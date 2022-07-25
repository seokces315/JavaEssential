package assign;

import java.util.Scanner;

public class Practice03 {

    public static void main(String[] args) {

        // 사용할 변수 초기화
        double x = 0.0, y = 0.0;
        // Scanner 클래스 선언
        Scanner sc = new Scanner(System.in);

        System.out.print("x 값을 입력하세요 >> ");
        // 자료형에 맞게 반환
        x = sc.nextDouble();
        y = x*x - 3*x + 7;
        sc.close(); // Scanner 클래스 종료

        // 형식에 맞게 출력
        System.out.printf("x = %.1f, y = %.1f", x, y);

    }

}
