import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[5];

        System.out.println("Enter 5 names:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        System.out.println("\n--- List of 5 Names ---");
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + ". " + names[i]);
        }

        scanner.close();
    }
}
