import java.util.Scanner;

public class Main {

    public static void checkNumber(Object o) {
        switch (o) {
            case Integer i when i > 0 -> System.out.println("Positive integer");
            case Integer i when i == 0 -> System.out.println("Zero");
            case Integer i -> System.out.println("Negative integer");
            default -> System.out.println("Not an integer");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        try {
            int number = Integer.parseInt(input);
            checkNumber(number);
        } catch (NumberFormatException e) {
            checkNumber(input);
        }

        scanner.close();
    }
}