import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.print("Please enter the number from 0 to 100: ");
        int number = new Scanner(System.in).nextInt();
        while (number<0 || number>100) {
            System.out.print("Invalid value entered. Please enter the number from 0 to 100: ");
            number = new Scanner(System.in).nextInt();
        }
        System.out.println("Thank you, your number is recorded!");
    }
}

  import java.util.Scanner;
public class Main {
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

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int x = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i <= x; i++) {
            sum += i;
        }
        for (int i = 0; i <= -x; i++) {
            sum -= i;
        }
        System.out.printf("The sum of all numbers from 0 to %d is %d.", x, sum);
    }
}

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.print("Please enter a number of channel from 1 to 9: ");
        String str = new String();
        Scanner scanner = new Scanner(System.in);
        for (String[] channels = {"News", "Sport", "Music", "Culture", "Films", "Cartoons", "Discovery", "Animal planet", "Health"};; ) {
            str = scanner.nextLine();
            if (str.equals("0")) {
                break;
            }
            System.out.println(channels[Integer.parseInt(str)-1]);
        }
    }
}