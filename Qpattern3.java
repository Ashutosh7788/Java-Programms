import java.util.Scanner;

public class question17
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int st = 1;
        int sp = n-1;

        int number_of_line = 1;
      
        while(number_of_line<=n)
        {
          // print spaces     
          for (int i = 0; i<sp;  i++) 
          {
               System.out.print( " ");
          }
          // print stars  
          for (int i = 0; i < st; i++) 
          {
               System.out.print("* ");
          }

          // prepare for next line
          System.out.println();
          st++;
          sp--;
          number_of_line++;  
          

          
          

        }
    }   
}