package study;

import java.util.Scanner;

public class D_CircleArea {

    public static void main(String[] args) {

        // 반지름을 이용해서 원의 면적을 구하기
        // 원의 면적 = 반지름 * 반지름 * PI
        // 원의 둘레 = 2 * 반지름 * PI
        final double PI = 3.141592;
        double radius;
        double area;
        double round;
        Scanner sc = new Scanner(System.in);

        System.out.print("반지름: ");
        radius = sc.nextInt();
        sc.close();

        area = radius * radius * PI;
        round = 2 * radius * PI;
        System.out.println("\n원의 면적 -> " + area);
        System.out.println("원의 둘레 -> " + round);

    }

}
