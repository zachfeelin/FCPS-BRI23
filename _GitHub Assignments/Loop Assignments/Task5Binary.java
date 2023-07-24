import java.util.Scanner;
public class Task5Binary {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number you would like to convert to binary:");
        int n = in.nextInt();
        int temp = n;
        if(temp > 255){
            temp = temp % 256;
        }
        //checking if number is negative
        if(temp<0){
            temp = temp % 256 + 256;
        }
        String binary = "0b";
        //debuging temp because it is off by one
        temp = temp + 1;
        //setting up the loop
        for(int x = 128; x > 0; x = x/2){
            if(x < temp){
                binary = binary + "1";
                temp = temp - x;
            }
            else{
                binary = binary + "0";
            }
        }
        System.out.println("The number " + n + " is equal to " + binary + " in binary.");
    }
}