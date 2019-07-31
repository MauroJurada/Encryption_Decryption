import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //sample input: 3 4 1 8
        //sample output: PaSsw0rD
        int upper = scanner.nextInt();
        int lower = scanner.nextInt();
        int digit = scanner.nextInt();
        int n = scanner.nextInt();
        int pos = 0;

        char[] password = new char[n];

        for (int i = 0; i < upper; i++) {
            password[pos++] = (char)(65+(i%23));
        }

        for (int i = 0; i < lower; i++) {
            password[pos++] = (char)(97+(i%23));
        }

        for (int i = 0; i < digit; i++) {
            password[pos++] = (char)(48+(i%10));
        }

        for (int i = 0; i < n-(upper+lower+digit); i++){
            password[pos++] = (char)(33+(i%5));
        }

        System.out.println(String.valueOf(password));
    }
}