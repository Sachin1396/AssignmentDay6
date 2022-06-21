import java.util.Scanner;

public class Febonacci {
    public static void main(String[] args)
    {
        System.out.println("enter the range number");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = 0 ;
        int b = 1;
        int c;
        System.out.println(a);
        System.out.println(b);
        for(int i=2;i<n;i++)
        {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
