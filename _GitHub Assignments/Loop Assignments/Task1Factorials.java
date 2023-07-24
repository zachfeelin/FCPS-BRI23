import java.util.Scanner;
public class Task1Factorials
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number you would like to see the factorial of:");
        int number = in.nextInt();
        int total = 1;
        for(int x = 1; x<= number; x++){
            total = total*x;
        }
        System.out.println(total);
    }
}