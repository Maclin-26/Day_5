import java.util.Scanner;
public  class Mango1
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        int n2=s.nextInt();
        int t=s.nextInt();
        int row=(t-1)/n2+1;
        int col=(t-1)%n2+1;
        if(row==1||col==1||col==n2)
        {
            System.out.print("Yes");
            return;
        }
        System.out.println("No");
    }
}