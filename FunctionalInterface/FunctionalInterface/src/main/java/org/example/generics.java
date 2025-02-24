package org.example;

import java.util.ArrayList;
import java.util.List;
// The advantage of using generics is that with this we can provide type safety to any object.
class Box<T>{
    T container;

    public Box(T container){
        this.container = container;
    }

    public Object getValue(){
        return container;
    }

    public void performSomeTask(){
        if(container instanceof String){
            System.out.println("Length of String Container is:" + ((String) container).length());
        }

        if(container instanceof Integer){
            System.out.println("In Integer Container");
        }
    }

}

public class generics {
    public static void main(String[] args){
        //Here it is type safe
        List<String> list1 = new ArrayList<>();
        list1.add("Ujjwal");
        System.out.println(list1); // [Ujjwal]

        //this list is not type safe
        List anotherList = new ArrayList();
        anotherList.add("Ujjwal");
        anotherList.add(2);
        System.out.println(anotherList); // [Ujjwal, 2]

        //here it will be of type which we want to assign
        //boz is of type String and boxInt is of type Integer
        Box<String> box = new Box<>("It's is of type string");
        System.out.println(box.getValue()); // It's is of type string
        System.out.println(box.getValue().getClass().getName()); // java.lang.String

        Box<Integer> boxInt = new Box<>(1);
        System.out.println(boxInt.getValue()); //1
        System.out.println(boxInt.getValue().getClass().getName()); // java.lang.Integer

        box.performSomeTask(); // Length of String Container is:22
        boxInt.performSomeTask(); // In Integer Container

        //This is the issue collections are not type safe
        List itemList = new ArrayList<>();
        itemList.add("Abc");
        itemList.add(2);
        System.out.println(itemList);
    }
}
