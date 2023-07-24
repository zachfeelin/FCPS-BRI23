public class Set1Prob4
{
   public static void main (String[] args)
   {
      char let = 'a';
      for(int c = 1; c <= 5; c++){
         for(int r = 1; r <= 5; r++){
            System.out.print(let + " ");
            let = (char)(1+let);
         }
         System.out.println();
      }
   }
}