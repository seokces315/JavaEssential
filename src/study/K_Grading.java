package study;

import java.util.Scanner;

public class K_Grading {

    public static void main(String[] args) {

        // 변수 선언
        char grade;
        int score;
        Scanner sc = new Scanner(System.in);

        // 점수 입력받기
        System.out.print("점수를 입력하세요(0~100): ");
        score = sc.nextInt();
        sc.close();

        // 조건문 이용하여 판별하기
        if(score >= 90)
            grade = 'A';
        else if(score >= 80)
            grade = 'B';
        else if(score >= 70)
            grade = 'C';
        else if(score >= 60)
            grade = 'D';
        else
            grade = 'F';

        // 결과 출력
        System.out.printf("학점은 '%c'입니다.\n", grade);

    }

}
