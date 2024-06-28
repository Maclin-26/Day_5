import java.util.Scanner;
class Lab2
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int y=s.nextInt();
        int z=s.nextInt();
        String str=s.nextLine();

        if(x<y)
        {
            System.out.println("L3");
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