import java.util.Scanner;
public class Set1Prob3
{
   public static void main (String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Please enter a number below:");
      int number = in.nextInt();
      System.out.println();
      System.out.println("Here are your numbers:");
      for(int i=1; i<=12; i++){
         System.out.println(number*i);
      }
   }
}