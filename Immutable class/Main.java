import java.util.*;
public class Main{
    public static void Main(String[] args) {
        String name = "Ujjwal";
        List<String> courses = new ArrayList<>();
        courses.add("Java");
        courses.add("C");
        Student student = new Student(name, courses);
        System.out.println(name);
        System.out.println(courses);
        
        name = "Kumar";
        courses.add("python");
        System.out.println(name);
        System.out.println(courses);
        
        System.out.println("Try programiz.pro");
    }
}
