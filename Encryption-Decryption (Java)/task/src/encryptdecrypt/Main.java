package encryptdecrypt;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine().toLowerCase(Locale.ENGLISH);
        int key = scanner.nextInt();
        //String line = "welcome to hyperskill".toLowerCase(Locale.ENGLISH);
        //int key = 5;

        String cyph = "";
        char x;

        for (int i = 0; i < line.length(); i++){
            x = line.charAt(i);
            if (x > 96 && x < 123){
                if (key+x > 122) x -= 26;
                cyph = cyph.concat( Character.toString((char)(x+key)));
            } else {
                cyph = cyph.concat(Character.toString(x));
            }
        }

        System.out.println(cyph);
    }
}
