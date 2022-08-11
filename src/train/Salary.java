package train;

import java.util.Scanner;

public class Salary {

    public static void main(String[] args) {

        // 변수 선언
        int fee, time;
        double salary;
        Scanner sc = new Scanner(System.in);

        // 데이터 입력받기
        System.out.println("시급입력");
        fee = sc.nextInt();
        System.out.println("근무시간");
        time = sc.nextInt();
        sc.close();

        // 예외 처리
        if((fee < 10000) || (time > 180)) {
            if(fee < 10000) { System.out.println("[에러] 기본 시급이 1만원보다 작습니다."); }
            if(time > 180) { System.out.println("[에러] 근무시간이 180시간을 초과하였습니다."); }
            System.exit(0);
        }

        // 조건 분기
        if(time > 160) { salary = fee*160 + fee*(time-160)*1.5; }
        else { salary = fee * time; }

        // 출력
        System.out.printf("[급여] %.0f원\n", salary);

    }

}
