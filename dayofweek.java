public class dayofweek {
    import java.util.Scanner;

//2. Write a Java program that takes a day number (1-7) as input and prints the corresponding day of the week using the switch-case statement.
public class DayOfWeek {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a day number (1-7): ");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day number.");
        }
    }

}




    

