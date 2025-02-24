package org.example;

public class arrayComparision {
    public static void main(String[] args){
        int[] a = {1,2,3,5,1};
        int[] b = {1,2,3};
        int[] c = {1,2,3,4};
        int sumA = 0;
        int sumB = 0;

        for(int i=0; i<b.length; i++){
            int res = a[i] ^ b[i];
            sumA += res;
        }
        if(sumA == 0)
            System.out.println("true");
        else
            System.out.println("false");

        for(int i=0; i<b.length; i++){
            {
                int res = a[i] ^ b[i];
                sumB += res;
            }
        }
        if(sumB == 0)
            System.out.println("true");
        else
            System.out.println("false");



    }
}
