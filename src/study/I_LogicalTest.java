package study;

public class I_LogicalTest {

    public static void main(String[] args) {

        int name = 'a';

        System.out.println(name);
        System.out.println('a' > 'b');
        System.out.println(3 >= 2);
        System.out.println(3 == 2);
        System.out.println(3 != 2);

        System.out.println((3 > 2) && (3 > 4));
        System.out.println((3 != 2) || (-1 > 0));

    }

}
