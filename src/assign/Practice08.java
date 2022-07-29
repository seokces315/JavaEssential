package assign;

import java.util.Scanner;

public class Practice08 {

    public static void main(String[] args) {

        // 변수 초기화 및 선언
        String coffee = null;
        int count = 0;
        Scanner sc = new Scanner(System.in);

        // 커피의 종류 및 개수 입력받기
        System.out.print("(종류 개수) 커피를 주문하세요 -> ");
        coffee = sc.next();
        count = sc.nextInt();
        sc.close();

        // switch문
        // 입력받은 데이터를 바탕으로 가격 출력
        switch(coffee) {
            case "에스프레소" :
                System.out.printf("%d 원입니다.", 2000*count);
                break;
            case "아메리카노" :
                System.out.printf("%d 원입니다.", 2500*count);
                break;
            case "카푸치노" :
                System.out.printf("%d 원입니다.", 3000*count);
                break;
            case "카페라떼" :
                System.out.printf("%d 원입니다.", 3500*count);
                break;
            default :
                System.out.println("잘못된 입력!");
        }

    }

}
