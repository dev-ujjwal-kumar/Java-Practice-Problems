import java.util.*;
public class Main{
    public static void main(String[] args) {
        String name = "Ujjwal";
        List<String> courses = new ArrayList<>();
        courses.add("Java");
        courses.add("C");
        TrafficLight trafficLight = new TrafficLight(name, courses);
        System.out.println(trafficLight.getCourses()); // java, c
        System.out.println("Before modification\n " + trafficLight); //Before modification name:Ujjwal Courses List length:2


        System.out.println("###########");

        courses.add("python");
        System.out.println(trafficLight.getCourses()); // java, c
        System.out.println("after modification\n" + trafficLight); // after modification  name:Ujjwal Courses List length:2
    }
}
