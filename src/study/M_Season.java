package study;

import java.util.Scanner;

public class M_Season {

    public static void main(String[] args) {

        // 변수 선언
        int month;
        Scanner sc = new Scanner(System.in);

        // 월(1~12) 입력받기
        System.out.print("월(1~12)을 입력하시오: ");
        month = sc.nextInt();
        sc.close();

        // switch문 사용해서 출력
        switch(month) {
            case 3 : // 3 또는 4가 입력되면 동작 후 break 못 찾음
            case 4 : // 이후 문장들이 동작으로 읽혀 break까지 실행
            case 5 :
                System.out.println("봄입니다.");
                break;
            case 6 : case 7 : case 8 : // case 나열가능
                System.out.println("여름입니다.");
                break;
            case 9 : case 10 : case 11 :
                System.out.println("가을입니다.");
                break;
            case 12 : case 1 : case 2 :
                System.out.println("겨울입니다.");
                break;
            default :
                System.out.println("잘못된 입력입니다.");
        }

    }

}
