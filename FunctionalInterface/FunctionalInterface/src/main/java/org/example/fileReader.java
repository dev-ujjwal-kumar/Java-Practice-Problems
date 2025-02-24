package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class fileReader {
    public static void main(String[] args) throws FileNotFoundException {
//        File myObj = new File("C:\\Users\\uuj2kor\\Desktop\\scanner.txt");
        File myObj = new File("C:\\Users\\uuj2kor\\Desktop\\Test.txt");
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            int index = data.indexOf("ECUPKI");
            if(index > 0) {
                System.out.println("present");
            }else{
                System.out.println("Not present");
            }
        }
        myReader.close();

    }}
