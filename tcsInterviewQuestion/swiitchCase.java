//Output of below code
public class SwitchExample {
    public static void main(String[] args) {
        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wednesday");
            case 4:
                System.out.println("Thursday");
            case 5:
                System.out.println("Friday");
            case 6:
                System.out.println("Saturday");
            case 7:
                System.out.println("Sunday");
            default:
                System.out.println("Invalid Day");
        }
    }
}
// O/P :- Wednesday
//        Thursday
//        Friday
//        Saturday
//        Sunday
//        Invalid Day

//If we don't use break statement then flow will continue till it encounters a break or some error is occured.
//    In Java, if you omit the break statement inside a switch case, fall-through behavior occurs. This means execution continues into the next case until it either:
//        Encounters a break
//        Reaches the end of the switch block
