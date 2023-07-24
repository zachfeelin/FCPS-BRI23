import java.util.Random;
public class RandomExample
{
   public static void main (String[] args)
   {
      //Initialize a new Random Number Generator (rng)
      Random rng = new Random();
      
               //Getting the random number
               //int x = rng.nextInt();
      
               //ROLLIN' THE DICE
               //System.out.println(x);
      
               //(this is the part where you run the code and find out the number is HUGEEE)
               //
               //
               //
               //-------------now we set limits----------
               //
               //
               //
      //getting random number between 15-25
      int x = rng.nextInt(11) + 15;
      System.out.println(x);
   }
}