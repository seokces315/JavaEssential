package study;

import java.util.Scanner;

public class L_NestedIf {

    public static void main(String[] args) {

        // 변수 선언
        int score;
        int year;
        Scanner sc = new Scanner(System.in);

        // 데이터 입력받기
        System.out.print("점수를 입력하세요(0~100): ");
        score = sc.nextInt();
        System.out.print("학년을 입력하세요(1~4): ");
        year = sc.nextInt();
        sc.close();

        // 조건문 이용하여 판별 후 출력
        if(score >= 60) {
            if(year != 4) {
                System.out.println("합격!");
            }
            else if(score >= 70) {
                System.out.println("합격!");
            }
            else {
                System.out.println("불합격!");
            }
        }
        else {
            System.out.println("불합격!");
        }

    }

}
