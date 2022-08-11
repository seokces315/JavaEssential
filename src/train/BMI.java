package train;

import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {

        // 변수 선언
        double BMI, T, W;
        Scanner sc = new Scanner(System.in);

        // 데이터 입력받기
        System.out.print("키(m) -> ");
        T = sc.nextDouble();
        System.out.print("체중(kg) -> ");
        W = sc.nextDouble();
        sc.close();

        // BMI 및 비만도 평가
        // 결과 출력(조건 분기)
        BMI = W / (T * T);

        System.out.printf("키: %.2fm\n", T);
        System.out.printf("체중: %.1fkg\n", W);
        System.out.printf("BMI: %.2f\n", BMI);

        if(BMI >= 30) { System.out.println("비만도: 비만"); }
        else if(BMI >= 25) { System.out.println("비만도: 과체중"); }
        else if(BMI >= 18.5) { System.out.println("비만도: 정상"); }
        else { System.out.println("비만도: 저체중"); }

    }

}
