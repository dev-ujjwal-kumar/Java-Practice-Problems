package Java.Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableExample {
    public static void main(String[] args){
        ArrayList<Employee> employee = new ArrayList<>();

        employee.add(new Employee("Abhi", "12345", 120));
        employee.add(new Employee("Raj", "54123", 13));
        employee.add(new Employee("Sohan", "12398", 15));
        employee.add(new Employee("Ujjwal", "12332", 20));

        System.out.println(employee);
        Collections.sort(employee);
        System.out.println(employee);
    }
    
}
