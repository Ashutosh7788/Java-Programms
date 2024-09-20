// Average of three number 
import java.util.Scanner;
class avg{
   public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of A:");
        int A=sc.nextInt();
        System.out.println("Enter the value of B:");
        int B=sc.nextInt();
        System.out.println("Enter the value of C:");
        int C=sc.nextInt();
        int average=(A+B+C)/3;
        System.out.println("Average is : " + average);
    }
}