package study;

import java.util.Scanner;

public class G_ArithmeticOperator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("몇 초인지 입력하세요: ");
        int time = sc.nextInt(); // 초의 정수값 입력
        sc.close();

        int second = time % 60;
        int minute = (time / 60) % 60;
        int hour = (time / 60) / 60;

        System.out.print(time + "초는 ");
        System.out.print(hour + "시간 ");
        System.out.print(minute + "분 ");
        System.out.println(second + "초입니다.");

    }

}
