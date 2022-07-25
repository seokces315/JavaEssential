package assign;

import java.util.Scanner;

public class Practice01 {

    public static void main(String[] args) {

        // 사용할 변수 초기화
        int a = 0, b = 0;
        // Scanner 클래스 선언
        Scanner sc = new Scanner(System.in);

        System.out.print("두 정수를 입력하세요(공백 구분) >> ");
        // 자료형에 맞게 반환
        a = sc.nextInt();
        b = sc.nextInt();
        sc.close(); // Scanner 클래스 종료

        // 형식에 맞게 출력
        System.out.printf("%d + %d = %d", a, b, a+b);

    }

}
