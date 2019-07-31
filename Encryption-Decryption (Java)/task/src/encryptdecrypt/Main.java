package encryptdecrypt;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String mode = scanner.nextLine();
        String line = scanner.nextLine();
        int key = scanner.nextInt();

        //String line = "Welcome to hyperskill!";
        //int key = 5;

        if (mode.equals("enc")){
            System.out.println(encrypt(line, key));
        } else {
            System.out.println(decrypt(line, key));
        }
    }
    
    private static String encrypt(String line, int key){
        String cyph = "";
        char x;

        for (int i = 0; i < line.length(); i++){
            cyph = cyph.concat( Character.toString((char)(line.charAt(i)+key)%127));
        }
        return cyph;
    }

    private static String decrypt(String line, int key){
        String cyph = "";
        char x;

        for (int i = 0; i < line.length(); i++){
            cyph = cyph.concat( Character.toString((char)(line.charAt(i)-key)%127));
        }
        return cyph;
    }
}
