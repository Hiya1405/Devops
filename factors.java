public class factors {
    
}import java.util.Scanner;
public class factors {
    public static void main(String[]args){
        Scanner ob = new Scanner(System.in);
        int a,i;
        System.out.println("Enter any number:=");
        a = ob.nextInt();
        System.out.println("Factors of "+ a + ":]" +
                "");
        for(i = 1; i <= a; i++){
            if(a % i == 0){
                System.out.println(i + "");
            }
        }
    }
}

