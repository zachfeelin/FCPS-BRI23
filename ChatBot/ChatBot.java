import java.util.Scanner;
public class ChatBot
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Hi! What's your name?");
      String name = in.nextLine();
      System.out.println("Hi " + name + "! How are you? (good/bad)");
      String status1 = in.nextLine();
      //How is the person TRAIL
      if(status1.equals("bad")){
         System.out.println("Aw! I'm sorry. Do you like gummy bears?");
      }
      else{
         System.out.println("Thats great! Do you like gummy bears? (yes/no)");
      }
      String status2 = in.nextLine();
      if(status2.endsWith("yes"))
      {
         System.out.println("OMG SAME! My favorite flavor is green, what about you, whats your favorite flavor?");
         String flav = in.nextLine();
         System.out.println("I love " + flav + " too!");
      }
      else{
         System.out.println("Oh, ok. Hmm...");
      }
      System.out.println("What do you like to do?");
      String doing = in.nextLine();
      System.out.println("Woah! I love doing " + doing + " too!");
      int questiondone = 0;
      while(questiondone == 0){
         System.out.println("Do you like Mac or PC? (mac/pc)");
         String status3 = in.nextLine();
         if(status3.startsWith("mac")){
            questiondone++;
            System.out.println("Woah! Me too! I love everything Apple!");
         }
         else if (status3.startsWith("pc")){
            questiondone++;
            System.out.println("That's cool! I personally prefer mac but I like PC too!");
         }
         else{
            System.out.println("Whoops! I didnt't quite catch that. Please try again and say \"mac\" or \"pc\"");
            System.out.println();
         }
      }
      System.out.println();
      System.out.println("I'm getting tired. I will go to sleep now. It was nice talking to you, " + name + "!             (press enter to end)");
      in.nextLine();
   }
}