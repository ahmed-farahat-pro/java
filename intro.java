import java.util.Scanner;

public class intro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input 4 marks
        System.out.println("Enter 4 marks:");
        System.out.print("Mark 1: ");
        int mark1 = scanner.nextInt();
        System.out.print("Mark 2: ");
        int mark2 = scanner.nextInt();
        System.out.print("Mark 3: ");
        int mark3 = scanner.nextInt();
        System.out.print("Mark 4: ");
        int mark4 = scanner.nextInt();

        // Calculate the average
        double average = (mark1 + mark2 + mark3 + mark4) / 4.0;

        // Check and print the result
        if (average < 60) {
            System.out.println("Fail");
        } else {
            System.out.println("Pass");
        }

        scanner.close();
    }
}
