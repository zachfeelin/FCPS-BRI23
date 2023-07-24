public class ArrayQuirks
{
   public static void main(String[] args)
   {
      int[] x = new int[]{1,2,3};
      int[] y = new int[]{1,2,3};
      
                         //== tells you if something is the same object, not if it has the same value
      System.out.println(x == y);
                         //This is true for everything exsept primitive types
      
      
                        //.equals will not work for arrays
      System.out.println(x.equals(y));
      
      //To check element equality for different array objects, you must use a for loop
      
/*
      
    
(new section)  

  
*/
    
      int[] a = new int[]{1,2,3};
      int[] b = a;
      a[1] = 75;
      
      //Even though we only changed the value of a[1], b[1] will also update too.
      //This is because Java saves a[] as {1,2,3} but only saves b[] as {a[]}
      System.out.println(a[1]);
      System.out.println(b[1]);
   }
}