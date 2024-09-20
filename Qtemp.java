// finsh that it prints you  have a fever if yourr tempertaure is above 100  and otherwise print you dont have a fever



import java.util.Scanner;

public class question12
 {
 public static void main(String[] args)
 {
   Scanner sc = new Scanner(System.in);
   double temp = sc.nextDouble();

// method 1
String s = temp>100? "you have fever" : "you have nothing";
System.out.println(s);
// method 2
   if( temp> 100 )
   {
     System.out.println(" you have fever ");
   }
   else{
     System.out.println(" you  dont have no fever ");
   }
 }
}
