import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

        System.out.println("Enter your birth month: ");
        int birthMonth = in.nextInt();

        if (birthMonth >= 1 && birthMonth <= 12) {
            System.out.println("Your birth month is: " + birthMonth);
        } else {
            System.out.println("You entered an invalid month value: " + birthMonth);
        }
        in.close();
    }
}