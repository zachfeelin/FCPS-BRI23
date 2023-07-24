import java.util.Scanner;
public class Task3BottleOfWater{
    public static void main(String[] args){
        //setting up scanner
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number of bottles of water you have on the wall:");
        int bottles = in.nextInt();
        //checking if the number of bottles is negative or zero
        if(bottles <= 0){
            System.out.println("ERROR! " + bottles + " is negative or zero, please enter a positive interager next run.");
        }
        //setting up the loop
        for(int x = bottles; x > 0; x--){
            if(x == 1){
                System.out.println("1 bottle of water on the wall, 1 bottle of water.");
                System.out.println("Knock it down, pass it around, no more bottles of water on the wall.");
                //pausing the program for a second
                try {
                    Thread.sleep(1000);
                }
                catch(Exception e){
                }
            }
            else{
                System.out.println(x + " bottles of water on the wall, " + x + " bottles of water.");
                System.out.println("Knock one down, pass it around, " + (x-1) + " bottles of water on the wall.");
                //pausing the program for a second
                try {
                    Thread.sleep(1000);
                }
                catch(Exception e){
                }
            }
        }
    }
}