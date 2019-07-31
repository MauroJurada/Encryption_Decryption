import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //https://target.com/index.html?pass=12345&port=8080&cookie=&host=localhost
        String url = scanner.nextLine();
        url = url.substring(url.indexOf("?") + 1);
        String pass = "";

        for (String part : url.split("&")) {
            System.out.print(part.substring(0, part.indexOf("=")) + " : ");
            if (part.substring(part.indexOf("=") + 1).isEmpty()) {
                System.out.println("not found");
            } else {
                System.out.println(part.substring(part.indexOf("=") + 1));
            }
            if (part.substring(0, part.indexOf("=")).equals("pass")){
                pass = part.substring(part.indexOf("=") + 1);
            }
        }

        if (!pass.isEmpty()) {
            System.out.println("password : " + pass);
        }
    }
}