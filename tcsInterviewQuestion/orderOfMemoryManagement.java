//String s1 = new String("abc");
//String s2 = new String("cde");
//String s3 = new String("def");
//
//s3 = s1;
//s1 = s2;
//s2 = s3;
//
//what will be the value of s1, s2, s3 and sequence of objects will be cleaned by garbage collector
public class StringTest {
    public static void main(String[] args) {
        String s1 = new String("abc");  // Object1 ("abc") in heap
        String s2 = new String("cde");  // Object2 ("cde") in heap
        String s3 = new String("def");  // Object3 ("def") in heap

        s3 = s1;  // Now, s3 points to s1 (Object1 "abc"), Object3 ("def") is now unreachable (eligible for GC)
        s1 = s2;  // Now, s1 points to Object2 ("cde"), Object1 ("abc") still has a reference (s3)
        s2 = s3;  // Now, s2 points to Object1 ("abc")

        System.out.println("s1: " + s1);  // "cde"
        System.out.println("s2: " + s2);  // "abc"
        System.out.println("s3: " + s3);  // "abc"
    }
}
// Draw variable assignement dig. you will get more
//Object3 "def" becomes unreachable immediately after s3 = s1; → First to be garbage collected.
//No other objects become unreachable, because "abc" and "cde" are still referenced by s1, s2, and s3.