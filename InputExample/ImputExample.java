import java.util.Scanner;
public class ImputExample
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Are you an e-girl? (say \"yes uwu\" or \"no bae\" to answer)");
      String estatus = in.nextLine();
      if(estatus.equals("yes uwu")){
      System.out.println("uwu thats so cute i am too :3");
      }
      if(estatus.equals("no bae")){
      System.out.println("litterally die get out of my sight you pathetic loser");
      }
         
   }
}