package study;

public class E_TypeConversion {

    public static void main(String[] args) {

        // 변수 선언
        byte b = 127;
        int i = 100;

        System.out.println(b+i); // (작은->큰) 방향의 변환, 손실 없음
        System.out.println(10/4);
        System.out.println(10.0/4); // 자동변환
        System.out.println((byte)(b+i)); // 강제변환
        System.out.println((int)2.9 + 1.8); // 강제변환
        System.out.println((int)(2.9 + 1.8)); // 강제변환
        System.out.println((int)(2.9) + (int)1.8); // 강제변환

    }

}
