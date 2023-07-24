public class ArrayExample
{
   public static void main(String[] args)
   {
      /*...
      String name1 = "David"
      String name2 = "Isabel"
      String name3 = "Phil"
      String name4 = "Jamie
      ...*/
      
      String[] names = new String[4];
      names[0] = "david";
      names[1] = "isabel";
      names[2] = "phil";
      names[3] = "jamie";
      //                  names.length is the length of the "names" array
      for(int x = 0; x < names.length; x++){
         System.out.println(names[x]);
      }
   }
}