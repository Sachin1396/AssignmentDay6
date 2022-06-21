import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args)
    {
        System.out.println("enter the number");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count=0;
        for (int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count=count+1;
            }
        }
        if(count==2)
        {
            System.out.println("It is a prime number");
        }
        else {
            System.out.println("It is not a prime number");
        }
    }
}
