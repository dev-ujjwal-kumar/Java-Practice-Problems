//What will be the output of below code snippet and final value of each variable
//        int a = 2;
//        int b = 5;
//
//        int total = a + (b > 6 ? ++a : b--);
//        System.out.println(total)

public class TernaryTest {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;

        int totalPre = a + (b > 6 ? ++a : b--);
        int totalPost = a + (b > 6 ? ++a : --b);
        System.out.println(total);
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
//totalPre = 6 (2 + 4), a = 2, b = 4 (In pre decrement first value will be decremented then assigned)
//totalPost = 7 (2 + 5), a= 2, b = 4 (In post decrement first value will be asigned then decremented)