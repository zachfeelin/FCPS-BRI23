import java.util.Scanner;
public class Loop1
{
   public static void main (String[] args)
   {
      Scanner in = new Scanner(System.in);
      //setting size
      System.out.println("State what size should the square grid be below:");
      int size = in.nextInt();
      //spacing out input from output because it looks better
      for(int space = 0; space < 5; space++){
         System.out.println();
      }
      //for each row
      for(int row = 0; row < size; row++)
      {
         //for each collumn
         for(int col = 0; col < size; col++)
         {
            System.out.print("*");
            //adding a space after every * exsept the last one
            if(col < size - 1){
               System.out.print(" ");
            }
         }
         System.out.println();//advance to next line
      }
   }
}