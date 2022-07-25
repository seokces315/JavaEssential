package assign;

import java.util.Scanner;

public class Practice02 {

    public static void main(String[] args) {

        // 사용할 변수 초기화
        int floor = 0;
        // Scanner 클래스 선언
        Scanner sc = new Scanner(System.in);

        System.out.print("몇 층인지 입력하세요 >> ");
        // 자료형에 맞게 반환
        floor = sc.nextInt();
        sc.close(); // Scanner 클래스 종료

        // 형식에 맞게 출력
        System.out.printf("건물의 높이는 %dm 입니다.", floor*5);

    }

}
