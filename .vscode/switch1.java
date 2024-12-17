import java.util.*;
public class switch1
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int a , b , c;
        System.out.print("Enter first no := ");
        a = ob.nextInt();
        b = ob.nextInt();

        System.out.print("Enter your choice [1. add 2. sub 3. mul 4. div ] :- ");
        c = ob.nextInt();

        int ans1=0;
        switch (c) {
            case 1:
                ans1 = a + b;
                break;
            case 2:
                ans1 = a - b;
                break;
            case 3:
                ans1 = a * b;
                break;
            case 4:
                ans1 = a / b;
                break;
            default:
                System.out.println("Invalid choice ");
        }
        System.out.println("Answer = "+ans1);
    }
}

