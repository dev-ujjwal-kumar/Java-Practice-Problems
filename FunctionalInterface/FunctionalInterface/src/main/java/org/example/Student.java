package org.example;

import java.util.ArrayList;
import java.util.List;

public final class Student {
    private final String name;
    private final List<String> courseList;

    //we are creating a new list and copying the contents from orignal list to new list
    //we are not adding setters. So that object modification is not possible.
    public Student(String name, List<String> courses){
        this.name = name;
        this.courseList = new ArrayList<>();
        for(String course : courses){
            courseList.add(course);

        }
    }
    public String getName() {
        return name;
    }

    public List<String> getCourses(){
        return courseList;
    }

    public static  void main(String[] args){
        List<String> courses = new ArrayList<>();
        courses.add("maths");
        courses.add("ECE");
        Student s1 = new Student("Ujjwal", courses);
        System.out.println(s1.getName());
        System.out.println(s1.getCourses());
        courses.add("java");
        System.out.println(s1.getName());
        System.out.println(s1.getCourses());
    }
}

//Output :-
//Ujjwal
//[maths, ECE]
//Ujjwal
//[maths, ECE]