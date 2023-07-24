import java.util.Random;
import java.util.Scanner;
public class NumberArcadeGame
{
   public static void main (String[] args)
   {
      Random rng = new Random();
      Scanner in = new Scanner(System.in);
      int x = rng.nextInt(10) + 1;
      int usergot = 0;
      System.out.println("Hello! I am *number arcade*.");
      while(usergot == 0){
         System.out.println("Please guess a number between 1 - 10");
         int guess = in.nextInt();
         if(guess == x){
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("Whohoo! You litterally slayed girl yas queen snaps to you! You slayed so much i gotta go. Baii!");
            usergot++;
         }
         else if (guess <= 10 && guess >= 1){
            System.out.println("Not quite! Try again...");
         }
         else{
            System.out.println("Gurl idk what you just entered but it aint even in the range, try again but CORRECTLY this time...");
         }
      }
   }
}