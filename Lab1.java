import java.util.Scanner;
class Lab1
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int y=s.nextInt();
        int z=s.nextInt();
        if(x<y)
        {
            System.out.println("L1");
        }
        else if(y<z)
        {
            System.out.println("L2");
        }
        else if(z<x)
        {
            System.out.println("L3");
        }
    }
}