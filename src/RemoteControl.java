import java.util.Scanner;

public class RemoteControl {
            public static void main(String[] args) {
            System.out.print("Please enter a number of channel from 1 to 9: ");
            String str = new String();
            Scanner scanner = new Scanner(System.in);
            for (String[] channels = {"News", "Sport", "Music", "Culture", "Films",
                    "Cartoons", "Discovery", "Animal planet", "Health"};; ) {
                str = scanner.nextLine();
                if (str.equals("0")) {
                    break;
                }
                System.out.println(channels[Integer.parseInt(str)-1]);
            }
        }
    }