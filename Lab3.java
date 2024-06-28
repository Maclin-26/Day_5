import java.util.Scanner;
class Lab3
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int y=s.nextInt();
        int z=s.nextInt();
        int n=s.nextInt();
        int count=0;
        for(int i=0;i<3;i++)
        {
            if(x>=n||y>=n||z>=n)
            {
                count+=1;
            }
        }
        System.out.print(count);

    }
}