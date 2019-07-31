package encryptdecrypt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String mode = "enc";
        String line = null;
        int key = 0;

        for (int i = 0; i < args.length; i += 2) {
            switch (args[i]){
                case "-mode":
                    mode = args[i+1];
                    break;
                case "-data":
                    line = args[i+1];
                    break;
                case "-key":
                    key = Integer.parseInt(args[i+1]);
                    break;
            }
        }

/*          If the -data argument is not specified, the program must wait
            for it and the -key argument from the standard input

        if (line.isEmpty()){
            line = scanner.nextLine();
            key = scanner.nextInt();
        }
*/

        if (mode.equals("enc")) {
            System.out.println(encrypt(line, key));
        } else {
            System.out.println(decrypt(line, key));
        }
    }

    private static String encrypt(String line, int key) {
        String cyph = "";

        for (int i = 0; i < line.length(); i++) {
            cyph = cyph.concat(Character.toString((char) (line.charAt(i) + key) % 127));
        }
        return cyph;
    }

    private static String decrypt(String line, int key) {
        String cyph = "";

        for (int i = 0; i < line.length(); i++) {
            cyph = cyph.concat(Character.toString((char) (line.charAt(i) - key) % 127));
        }
        return cyph;
    }
}
