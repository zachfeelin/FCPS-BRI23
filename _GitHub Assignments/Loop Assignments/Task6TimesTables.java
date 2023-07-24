import java.util.Scanner;
public class Task6TimesTables {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number you would like to see the times tables of:");
        int n = in.nextInt();
        //getting the abs of n in case of negative
        n = java.lang.Math.abs(n);
        //setting up the grid
        System.out.println();
        System.out.println("__________________________________________________________________________________________________________");
        System.out.println();
        System.out.println();
        //setting up the horizontal top numbers
        System.out.print("\t ");
        for(int x = 1; x <= n; x++){
            System.out.print("\t" + x);
        }
        System.out.println();
        //setting up the horizontal line
        System.out.print("\t ");
        for(int x = 1; x <= n; x++){
            System.out.print("________");
        }
        System.out.print("___");
        System.out.println();
        //setting up the nested loops
        for(int x = 1; x <= n; x++){
            System.out.print(x + "\t|\t");
            for(int y = 1; y <= n; y++){
                System.out.print(x*y + "\t");
            }
            //printing a new line
            System.out.println();
        }
        //printing sepretion space because it looks better
        System.out.println();
        System.out.println();
    }
}