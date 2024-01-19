import java.util.Scanner;

public class Lab4_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accepting a string from the user
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Calculating the length of the string
        int length = inputString.length();

        // Checking if the length is even or odd
        if (length % 2 == 0) {
            // For even length, printing the second half
            int middleIndex = length / 2;
            String secondHalf = inputString.substring(middleIndex);
            System.out.println("Second half of the string: " + secondHalf);
        } else {
            // For odd length, printing the second half (excluding the middle character)
            int middleIndex = length / 2;
            String secondHalf = inputString.substring(middleIndex + 1);
            System.out.println("Second half of the string: " + secondHalf);
        }

        scanner.close();
    }
}