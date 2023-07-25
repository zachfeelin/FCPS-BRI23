import java.util.Scanner;
public class CaesarCipher {
    public static String encryptCaesar(String plaintext, int key){
        String ret = "";

        for(int i=0; i<plaintext.length(); i++){
            char c = plaintext.charAt(i); // retrieve original character
            if (!Character.isLetter(c)) {
                System.out.println("Invalid input. Only letters are allowed.");
                return null;
            }
            if ((c > 'z' - key && c <= 'z') || (c > 'Z' - key && c <= 'Z')) {
                c = (char)(c - 26);
            }
            c = (char)(c + key); // transform original character
            ret = ret + c; // append transformed character to final string
        }
        return ret;
    }
    

    public static String decryptCaesar(String ciphertext, int key){
        return encryptCaesar(ciphertext, -key);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("------------------------------------------");
        System.out.println();
        System.out.println("Caesar Cipher - Encrypt or Decrypt? (e/d)");
        String choice = scanner.nextLine();
        System.out.println();
        System.out.println("------------------------------------------");
        System.out.println();
        if(choice.equals("e")){
            System.out.println("(to avoid errors only enter letters)");
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
        } else if(choice.equals("d")){
            System.out.println("(to avoid errors only enter letters)");
            System.out.println("Enter the text to decrypt:");
            String plaintext = scanner.nextLine();
            System.out.println();
            System.out.println("Enter the encryption key:");
            int key = scanner.nextInt();
            System.out.println();
            System.out.println("------------------------------------------");
            System.out.println();
            String ciphertext = encryptCaesar(plaintext, key);
            System.out.println("Plain text: " + ciphertext);
            System.out.println();
            System.out.println("------------------------------------------");
            System.out.println();
            scanner.close();
        } else {
            System.out.println("Invalid choice. Please re-run program and try again.");
            scanner.close();
        }
    }
}