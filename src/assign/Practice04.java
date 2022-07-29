package assign;

import java.util.Scanner;

public class Practice04 {

    public static void main(String[] args) {

        // 변수 초기화 및 선언
        int x = 0, y = 0;
        Scanner sc = new Scanner(System.in);

        // 점 (x, y) 입력받기
        System.out.print("<공백 구분> 점 (x, y)의 좌표: ");
        x = sc.nextInt();
        y = sc.nextInt();
        sc.close();

        // if ~ else문
        // AND 연산
        // 점이 (50, 50), (100, 100)의 직사각형 안에 있는지 판별
        if((50 <= x && x <= 100) && (50 <= y && y <= 100)) {
            System.out.printf("점 (%d, %d)은 (50, 50)과 (100, 100)의 사각형 내에 있습니다.", x, y);
        }
        else {
            System.out.printf("점 (%d, %d)은 (50, 50)과 (100, 100)의 사각형 내에 없습니다.", x, y);
        }

    }

}
