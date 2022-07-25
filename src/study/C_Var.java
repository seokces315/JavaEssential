package study;

public class C_Var {

    public static void main(String[] args) {

        var price = 200;    // int 타입으로 결정됨
        var name = "kitae"; // String 타입으로 결정됨
        var pi = 3.14;      // double 타입으로 결정됨

        System.out.println("price = " + (price + 1000));
        System.out.println("name = " + name);
        System.out.println("pi = " + pi*10);

    }

}
