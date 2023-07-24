public class MethodExample
{
   public static void main (String[] args)
   {
      //Here is the method
      sayHello();
      
      //this is printint the output of an interager method with inputs
      System.out.println(add(6, 7));
   }
   
   //this is a method
   public static void sayHello()
   {
      //This will not display until put in "public static void ***main***"
      System.out.println("Hello!");
   }
   
   //Input: 2 ints (x & y)
   //Output: sum of ints
   public static int add(int x, int y)
   {
      return (x + y);
   }
}