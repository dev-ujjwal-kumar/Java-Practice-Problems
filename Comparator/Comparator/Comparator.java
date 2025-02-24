package Java.Comparator.Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Comparator {
    public static void main(String[] args){
        ArrayList<Employee> employee = new ArrayList<>();

        employee.add(new Employee("Abhi", "12345", 120));
        employee.add(new Employee("Raj", "54123", 13));
        employee.add(new Employee("Ujjwal", "12332", 20));
        employee.add(new Employee("Sohan", "12398", 15));
        

        System.out.println(employee);
        Collections.sort(employee, new idComparator());
        System.out.println(employee);

        Collections.sort(employee, new nameComparator());
        System.out.println(employee);

    }
}
