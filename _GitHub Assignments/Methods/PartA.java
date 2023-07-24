//Static, No Return Type, No Arguments
import java.util.Random;
import java.util.Scanner;
public class PartA {
    public static void main(String[] args) {
        //asking user which method they want to run
        Scanner in = new Scanner(System.in);
        System.out.println("Which method would you like to run?");
        System.out.println("1. printGreeting");
        System.out.println("2. singSong");
        System.out.println("3. spamWithGreetings");
        System.out.println("4. getAndCommentOnFavoriteColor");
        int method = in.nextInt();
        if(method == 1){
            System.out.println();
            printGreeting();
        }
        else if(method == 2){
            System.out.println();
            singSong();
        }
        else if(method == 3){
            System.out.println();
            spamWithGreetings();
        }
        else if(method == 4){
            System.out.println();
            getAndCommentOnFavoriteColor();
        }
        else{
            System.out.println();
            System.out.println("That is not a valid method.");
        }
    }
    public static void printGreeting() {
        System.out.println("Hello there, nice to see you! I hope you have a great day! :)");
    }
    public static void singSong() {
        //singing the chorus of "barbie girl" by aqua 5 times
        for(int times = 0; times < 5; times++){
            System.out.print("I'm a barbie girl, ");
            pause(500);
            System.out.println("in a barbie world.");
            pause(1000);
            System.out.print("Life in plastic, ");
            pause(500);
            System.out.println("it's fantastic!");
            pause(1000);
            System.out.print("You can brush my hair, ");
            pause(500);
            System.out.println("undress me everywhere.");
            pause(1000);
            System.out.print("Imagination, ");
            pause(500);
            System.out.println("life is your creation.");
            pause(1000);
            System.out.println("Come on, barbie, let's go party!");
            pause(2000);
            System.out.println();
            System.out.println();
            pause(2000);
        }
    }
    public static void spamWithGreetings() {
        for(int x = 0; x < 10; x++){
            printGreeting();
            pause(500);
        }
    }
    public static void getAndCommentOnFavoriteColor(){
        Scanner in = new Scanner(System.in);
        System.out.println("What is your favorite color?");
        String color = in.nextLine();
        Random rng = new Random();
        int message = rng.nextInt(5);
        if(message == 0){
            System.out.println(color + "'s a nice color!");
        }
        else if(message == 1){
            System.out.println("I like " + color +" color too!");
        }
        else if(message == 2){
            System.out.println(color + "'s a pretty color!");
        }
        else if(message == 3){
            System.out.println(color + "'s a cool color!");
        }
        else if(message == 4){
            System.out.println(color + "'s a beautiful color!");
        }
        else if(message == 5){
            System.out.println(color + "'s a great color!");
        }
    }

    //pause method
    public static void pause(int milsecs){
        try {
            Thread.sleep(milsecs);
        } 
        catch (Exception e) {
        }
    }
}