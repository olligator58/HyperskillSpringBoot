import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        Locale.setDefault(Locale.US);
        System.out.printf("%.2f", new Square(scanner.nextDouble()).getArea());
    }
}

sealed interface ShapeInterface permits Square {
    double getArea();
}

final class Square implements ShapeInterface {
    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}