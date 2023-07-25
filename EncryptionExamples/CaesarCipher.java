import java.util.Scanner;
public class CaesarCipher {
    public static String encryptCaesar(String plaintext, int key){
        String ret = "";

        for(int i=0; i<plaintext.length(); i++){
            char c = plaintext.charAt(i); // retrieve original character
            c = (char)(c + key); // transform original character
            ret = ret + c; // append transformed character to final string
        }
        return ret;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("------------------------------------------");
        System.out.println();
        System.out.println("Enter the text to encrypt:");
        String plaintext = scanner.nextLine();
        System.out.println();
        System.out.println("Enter the encryption key:");
        int key = scanner.nextInt();
        System.out.println();
        System.out.println("------------------------------------------");
        System.out.println();
        String ciphertext = encryptCaesar(plaintext, key);
        System.out.println("Encrypted text: " + ciphertext);
        System.out.println();
        System.out.println("------------------------------------------");
        System.out.println();
        scanner.close();
    }
}