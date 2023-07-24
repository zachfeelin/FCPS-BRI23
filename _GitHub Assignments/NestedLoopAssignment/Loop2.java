import java.util.Scanner;
public class Loop2
{
   public static void main (String[] args)
   {
      Scanner in = new Scanner(System.in);
      //setting size
      System.out.println("State what size should the tower be below:");
      int size = in.nextInt();
      //spacing out input from output because it looks better
      for(int space = 0; space < 5; space++){
         System.out.println();
      }
      //for each row
      for(int row = 0; row < size; row++)
      {
         //printing each collumn
         for(int amount = 0; amount <= row; amount++){ 
            System.out.print("*");
            }
      System.out.println();//advance to next line
      }
   }
}