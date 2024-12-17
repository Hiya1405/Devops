public class swap {
    
}
class swap
{
    int a,b,c;
    void getdata(int x, int y)
    {
       a = x;
       b = y;
    }
    void process()
    {
       c = a;
       a = b;
       b = c;
    }
    void disp()
    {
        System.out.println("a ="+a);
        System.out.println("b ="+b);

    }
}
class sample2
{
   public static void main(String arg[])
   {
       swap ob = new swap();
       ob.getdata(10,20);
       ob.process();
       ob.disp();
   }
}
