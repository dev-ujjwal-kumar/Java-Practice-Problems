import java.util..*;

public final class Student{
    private final String name;
    private final List<String> courses;

    TrafficLight(String name, List<String> courses){
        this.name = name;
        this.courses = new ArrayList<>(courses);
    }

    public String getName(){
        return name;
    }

    public List<String> getCourses(){
        return new ArrayList<>(courses);
    }

    public String toString(){
        return "name:" + name + " \nCourses List length:" + courses.size();
    }


}