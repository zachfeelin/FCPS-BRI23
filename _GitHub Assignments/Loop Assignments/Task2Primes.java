import java.util.Scanner;
public class Task2Primes {
    public static void main(String[] String){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number you would like to see if it is prime:");
        int number = in.nextInt();
        //checking if number is 0 or 1
        if(number == 1 || number == 0){
            System.out.println(number + " is special - it is neither prime nor composite.");
        }
        //checking if number is negative
        else if(number<0){
            System.out.println("ERROR! " + number + " is negative, please enter a positive interager next run.");
        }
        //running the program if the programs above were not run
        else{
            //setting up if composite was found
            int compfind = 0;
            for(int x = 1; compfind == 0 && x < number; x++){
                if(number%x == 0){
                    if(x == number || x == 1){
                        //this is to make sure the calculation won't check if the number is divisible by itself or 1
                    }
                    else{
                        compfind++;
                    }
                }
            }
            if(compfind == 1){
                System.out.println(number + " is composite.");
            }
            else{
                System.out.println(number + " is prime.");
            }
        }
    }
}