public class radis {
    
}
import java.util.Scanner;

class radius
{   double pi;
    int r;
    double a,circum;
    void getdata( int y)
    {
        pi = 3.14;
        r = y;
    }
    void process()
    {
        a = pi * r * r;
        circum = 2 * pi * r;
    }
    void disp()
    {
        System.out.println("area of circle =    `"+a);
        System.out.println("circumference of circle = "+circum);

    }

}
class sample3
{
    public static void main(String arg[])
    {   Scanner in = new Scanner(System.in);
        radius ob = new radius();
        int y;
        System.out.print("Enter another no :- ");
        y = in.nextInt();
        ob.getdata(y);
        ob.process();
        ob.disp();
    }
}

