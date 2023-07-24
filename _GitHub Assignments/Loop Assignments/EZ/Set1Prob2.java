import java.util.Scanner;
public class Set1Prob2
{
   public static void main (String[] args)
   {
      System.out.println("Please enter a positive number below:");
      Scanner in = new Scanner(System.in);
      int number = in.nextInt();
      int on = 0;
      if(number>=0){
         while(on <= number){
            if(on%3 == 0){
               System.out.println(on);
            }
            on++;
         }
      }
      else{
         System.out.println("Error: Number has to be positive. Please re-run program and try again.");
      }
   }
}