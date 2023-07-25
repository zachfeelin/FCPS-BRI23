import java.io.File;
import java.io.FileNotFoundException; //this is needed to catch the error
import java.io.PrintWriter;
import java.util.Scanner;
public class FileWritingExample {
    public static void main(String[] args) {
        File file = new File("FileEditingExample/input.txt");
        try {
            PrintWriter writer = new PrintWriter(file);
            Scanner in = new Scanner(System.in);
            System.out.println();
            System.out.println("------------------------------------------");
            System.out.println();
            System.out.println("File found. Program will write in the specified section. Enter text below:");
            System.out.println();
            writer.println(in.nextLine());
            writer.close();
            in.close();
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