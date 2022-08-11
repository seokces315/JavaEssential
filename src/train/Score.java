package train;

import java.util.Scanner;

public class Score {

    public static void main(String[] args) {

        // 변수 선언
        int math, english;
        Scanner sc = new Scanner(System.in);

        // 데이터 입력받기
        System.out.println("수학점수 입력");
        math = sc.nextInt();
        System.out.println("영어점수 입력");
        english = sc.nextInt();
        sc.close();

        // 조건 분기
        if((math >= 90) || (english >= 90)) {
            if((math >= 90) && (english >= 90)) { System.out.println("전액 장학금!"); }
            else { System.out.println("반액 장학금!"); }
        }
        else { System.out.println("다음 기회에~"); }

    }

}
