package Java.siemens; 

public class test { 
    static {
        System.out.println(" Static mthod");
    }

    private int test1(int a, int b){
        System.out.println("test1 A B");
        return a+b;
    }

	public static void main(String[] args) {
        System.out.println("test Method with variable "+ new test().test1(3,5));
    }
}