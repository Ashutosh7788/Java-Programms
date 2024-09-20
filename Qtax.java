//bill of items 
import java.util.Scanner;

public class question4 {
    public static void main(String[] args)
     {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter pencile price : ");
       float pencil = sc.nextFloat();
       System.out.println("Enter pen price : ");
       float pen = sc.nextFloat();
       System.out.println("Enter eraser price : ");
       float eraser = sc.nextFloat();
       float total = pencil + pen + eraser;
       System.out.println("Bill is : " + total);
       // Add on - with 18% tax 
       float newTotal = total + (0.18f * total);
       System.out.println(newTotal);
    }
}
