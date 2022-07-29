package assign;

import java.util.Scanner;

public class Practice06 {

    public static void main(String[] args) {

        // 변수 초기화 및 선언
        String grade = null;
        Scanner sc = new Scanner(System.in);

        // 학점 입력받기
        System.out.print("학점: ");
        grade = sc.next();
        sc.close();

        // switch문(break 활용)
        // case 비교해서 출력
        // default 이용해서 예외처리
        switch(grade) {
            case "A" :
            case "B" :
                System.out.println("Excellent");
                break;
            case "C" : case "D" :
                System.out.println("Good");
                break;
            case "F" :
                System.out.println("Bad");
                break;
            default :
                System.out.println("잘못된 입력!");
        }

    }

}
