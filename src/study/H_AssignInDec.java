package study;

public class H_AssignInDec {

    public static void main(String[] args) {

        int a = 3, b = 3, c = 3;

        a += 3; // a = a + 3
        b *= 3; // b = b * 3
        c %= 2; // c = c % 2
        System.out.printf("a = %d, b = %d, c = %d", a, b, c);

        int d = 3;

        a = d++;
        System.out.printf("\na = %d, d = %d", a, d);
        a = ++d;
        System.out.printf("\na = %d, d = %d", a, d);
        a = d--;
        System.out.printf("\na = %d, d = %d", a, d);
        a = --d;
        System.out.printf("\na = %d, d = %d", a, d);

    }

}
