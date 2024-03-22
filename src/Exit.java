import java.util.Scanner;

public class Exit {
        public static void main(String[] args) {
            String str = new String();
            Scanner scanner = new Scanner(System.in);
            while (!str.equals("Exit")) {
                System.out.print("Please enter something: ");
                str = scanner.nextLine();
            }
            System.out.println("Good buy!");
        }
    }