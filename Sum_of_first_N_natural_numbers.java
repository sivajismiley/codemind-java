import java.util.Scanner;
public class Sum
{
 public static void main(String[] args)
 {
     int i,n,sum=0;
     Scanner sc=new Scanner(System.in);
     n=sc.nextInt();
     sum=(n*(n+1))/2;
     System.out.printf("%d",sum);
}
}