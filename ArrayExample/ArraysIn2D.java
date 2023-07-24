public class ArraysIn2D
{
   public static void main (String[] args)
   {
      int[][] ar = new int[3][2];
      ar[2][1] = 7;
      
      //for each row
      for(int row = 0; row < ar.length; row++)
      {
         //for each collumn (slot) in that row
         for(int col = 0; col < ar[row].length;col++)
         {
            System.out.print(ar[row][col] + " ");
         }
         System.out.println();//advance to next line
      }
   }
}