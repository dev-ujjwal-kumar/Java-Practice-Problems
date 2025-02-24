package Java.Exception;

public class checkName {
    public static void main(String[] args){
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
          } catch(Exception e){
            System.out.println("In exception block");
          } 
          finally {
            System.out.println("The 'try catch' is finished.");
          }
    }
}
