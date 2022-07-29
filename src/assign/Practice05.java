package assign;

import java.util.Scanner;

public class Practice05 {

    public static void main(String[] args) {

        // 변수 초기화 및 선언
        int input = 0;
        Scanner sc = new Scanner(System.in);

        // 돈의 액수를 입력받기
        System.out.print("돈의 액수: ");
        input = sc.nextInt();
        sc.close();

        // input의 몫 계산을 진행한 후 출력
        // 나머지 데이터를 다시 input 변수에 저장
        System.out.printf("5만원 -> %d개\n", input/50000);
        input %= 50000;
        System.out.printf("1만원 -> %d개\n", input/10000);
        input %= 10000;
        System.out.printf("1천원 -> %d개\n", input/1000);
        input %= 1000;
        System.out.printf("500원 -> %d개\n", input/500);
        input %= 500;
        System.out.printf("100원 -> %d개\n", input/100);
        input %= 100;
        System.out.printf(" 10원 -> %d개\n", input/10);
        input %= 10;
        System.out.printf("  1원 -> %d개", input);

    }

}
