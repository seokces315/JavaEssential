package assign;

import java.util.Scanner;

public class Practice07 {

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

        // if ~ else문
        // 입력받은 데이터를 바탕으로 가격 출력
        if(coffee.equals("에스프레소")) {
            System.out.printf("%d 원입니다.", 2000*count);
        }
        else if(coffee.equals("아메리카노")) {
            System.out.printf("%d 원입니다.", 2500*count);
        }
        else if(coffee.equals("카푸치노")) {
            System.out.printf("%d 원입니다.", 3000*count);
        }
        else if(coffee.equals("카페라떼")) {
            System.out.printf("%d 원입니다.", 3500*count);
        }
        else {
            System.out.println("잘못된 입력!");
        }

    }

}
