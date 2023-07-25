import java.io.File;
import java.io.FileNotFoundException; //this is needed to catch the error
import java.util.Scanner;
public class FileReadingExample {
    public static void main(String[] args) {
        File file = new File("FileReadingExample/input.txt");
        try {
            Scanner scan = new Scanner(file);
            System.out.println();
            System.out.println("------------------------------------------");
            System.out.println();
            System.out.println("File found. Program will read specified section below:");
            System.out.println();
            String firstline = scan.nextLine(); //this will read the first line
            System.out.println(firstline);
        } catch (Exception e) {
            System.out.println();
            System.out.println("------------------------------------------");
            System.out.println();
            System.out.println("An error occurred. Program will state error below:");
            System.out.println();
            e.printStackTrace(); //this will print the error as the program sees it if it chrashes
        }
    }
}



/* ------------------------------------------FIRST ATTEMPT------------------------------------------
import java.io.File;
import java.util.Scanner;
public class FileReadingExample{
    public static void main(String[] args){
        File file = new File("input.txt");
        Scanner scan = new Scanner(file);
        String firstline = scan.nextLine();
        System.out.println(firstline);
    }
}
import java.io.File;
import java.util.Scanner;
*/