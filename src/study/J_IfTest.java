package study;

import java.util.Scanner;

public class J_IfTest {

    public static void main(String[] args) {

        // 나이를 입력받을 수 있도록 Scanner 클래스를 작성
        // 입력받은 나이는 age 변수에 저장
        int age = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("나이를 입력: ");
        age = sc.nextInt();
        sc.close();

        // if문을 이용해서 age 값이 20대인지를 판별
        if((age >= 20) && (age < 30)) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }

    }

}
