import java.util.*;

public final class Student{
    private String name;
    private List<String> courses;
    
    Student(String name, List<String> courses){
        this.name = name;
        this.courses = courses;
    }
    
    public String getName(){
        return name;
    }
    
    public List<String> getCourses(){
        return new ArrayList<>(courses);
    }
    
    public String toString(){
        return "name:" + name + "Courses List lenght:" + courses.size();
    }
    
}

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