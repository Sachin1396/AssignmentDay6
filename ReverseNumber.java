import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args)
    {
        System.out.println("Enter the number");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int r=0;
        while (n!=0)
        {
            int t=n%10;
            r=r*10+t;
            n=n/10;

        }
        System.out.println("reverse number"+ r);
    }
}
