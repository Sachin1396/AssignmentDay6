import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args)
    {
        System.out.println("enter the number");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0 ;
        for (int i=1;i<=n/2;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum==n)
        {
            System.out.println("N is perfect number");
        }
        else
        {
            System.out.println("N is not a perfect number");
        }
    }
}
