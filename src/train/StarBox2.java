package train;

import java.util.Scanner;

public class StarBox2 {

    public static void main(String[] args) {

        // 변수 선언
        int length;
        Scanner sc = new Scanner(System.in);

        // 데이터 입력받기
        System.out.print("length -> ");
        length = sc.nextInt();
        sc.close();

        // 별박스 출력
        for(int i=0 ; i<length ; i++) {
            for(int j=0 ; j<=i ; j++) { System.out.print("* "); }
            System.out.println();
        }

    }

}
