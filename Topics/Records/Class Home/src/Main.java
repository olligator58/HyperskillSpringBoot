import java.util.Locale;
import java.util.Scanner;

record Home(String address, String city, String state, String zipCode) {

    public Home {
        if (zipCode == null) {
            zipCode = "unknown";
        }
        address = address.toUpperCase(Locale.ENGLISH);
        city = city.toUpperCase(Locale.ENGLISH);
        state = state.toUpperCase(Locale.ENGLISH);
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Home home = new Home(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
        System.out.println(home);
    }
}