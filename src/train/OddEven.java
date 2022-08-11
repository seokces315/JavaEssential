package train;

public class OddEven {

    public static void main(String[] args) {

        // 변수 선언 및 초기화
        int oddSum = 0;
        int evenSum = 0;

        // 조건 분기
        for(int i=1 ; i<=100 ; i++) {
            if(i % 2 == 1) { oddSum += i; }
            else { evenSum += i; }
        }

        // 출력
        System.out.println("1부터 100 사이의 정수 중");
        System.out.println("홀수의 합: " + oddSum);
        System.out.println("짝수의 합: " + evenSum);

    }

}
