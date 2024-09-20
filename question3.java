
import java.util.Scanner;

// Average of  3 numbers
public class question3
{
public static void main(String[] args)
 {
   Scanner sc = new Scanner(System.in);
   System.out.println("input 1st number : "); 
   int A = sc.nextInt();

   System.out.println("input 2nd number : ");
   int B = sc.nextInt();

   System.out.println("input 3rd number : ");
   int C = sc.nextInt();

   int average = (A+B+C)/3;
   System.out.println("average is : " + average);
 }

}