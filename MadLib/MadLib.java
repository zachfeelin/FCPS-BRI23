import java.util.Scanner;
public class MadLib
{
   public static void main (String[] args)
   {
      int e = 0;
      while(e == 0){
         System.out.println("Hello- *uwu* wanna do a *cute adjective* M-mm-madLib? (yea uwu/no bae)");
         Scanner in = new Scanner(System.in);
         String estatus = in.nextLine();
         if(estatus.contains("y")){
         //GO   HERE
         System.out.println();
         System.out.println("omg yas lets go girl");
         System.out.println();
         System.out.println("ok lets go, gimmie an adverb");
         String inputNO1 = in.nextLine();
         System.out.println();
         System.out.println("yas ok gurl now a verb");
         String inputNO2 = in.nextLine();
         System.out.println();
         System.out.println("slay its giving now a name");
         String inputNO3 = in.nextLine();
         System.out.println();
         System.out.println("ok its giving like that noun your bout to give me");
         String inputNO4 = in.nextLine();
         System.out.println();
         System.out.println("adjective now");
         String inputNO5 = in.nextLine();
         System.out.println();
         System.out.println("verb with ing bc ing");
         String inputNO6 = in.nextLine();
         System.out.println();
         System.out.println("now my fave, a show name. my personal fave is barbie but u pick");
         String inputNO7 = in.nextLine();
         System.out.println();
         System.out.println("ok now a show genra, but it can be different from the show above");
         String inputNO8 = in.nextLine();
         System.out.println();
         System.out.println("now an adjective");
         String inputNO9 = in.nextLine();
         System.out.println();
         System.out.println("EEK! there was a spider! give an exclimation like that!");
         String inputNO10 = in.nextLine();
         System.out.println();
         System.out.println("gimmie a relationship like that one aunt who stalks you on facebook");
         String inputNO11 = in.nextLine();
         System.out.println();
         System.out.println("now gave me a past tense verb");
         String inputNO12 = in.nextLine();
         System.out.println();
         System.out.println("noun.");
         String inputNO13 = in.nextLine();
         System.out.println();
         System.out.println("verb sil'vous plais");
         String inputNO14 = in.nextLine();
         System.out.println();
         System.out.println("last one gurly! for our farewell, give me a leaving greeting like bye, but not boring");
         String inputNO15 = in.nextLine();
         System.out.println();
         System.out.println("perf gurly! " + inputNO15 + "! oh wait, let me give you the madlib!");
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println("----------------------------");
         System.out.println();
         System.out.println();
         System.out.println();
         //START LIB
         System.out.println("Hewo! *" + inputNO1 + " " + inputNO2 + "*!");
         System.out.println("I am " + inputNO3 + ", and I love " + inputNO4 + "!");
         System.out.println("I am " + inputNO5 + " and stay up all night " + inputNO6 + " my weeb friends.");
         System.out.println("I watch " + inputNO7 + " which is a " + inputNO8 + ".");
         System.out.println("It is really " + inputNO9 + "!");
         System.out.println("Oh, " + inputNO10 + ", I-i have to go-!");
         System.out.println("My " + inputNO11 + " is calling me because they " + inputNO12 + " the " + inputNO13 + "!");
         System.out.println("Gotta " + inputNO14 + "- " + inputNO15 + "!");
         //END LIB
         //STOP HERE
         e++;
         }
         else if(estatus.contains("n")){
         System.out.println("gurl why are you here then");
         System.out.println(".");
         System.out.println(".");
         System.out.println(".");
         System.out.println("whatever. bye. btw i told your crush u like them yw baiii!");
         e++;
         }
         else{
         System.out.println("whoops something went wrong, try again");
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println("----------------------------");
         System.out.println();
         System.out.println();
         System.out.println();
         }
      }
   }
}