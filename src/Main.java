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