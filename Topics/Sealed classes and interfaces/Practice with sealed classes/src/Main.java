import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale locale = Locale.US;
        scanner.useLocale(locale);
        Locale.setDefault(locale);
        System.out.printf("%.2f", new Square(scanner.nextDouble()).getArea());
        scanner.close();
    }
}

sealed abstract class Shape permits Square {
    abstract double getArea();
}

final class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    double getArea() {
        return side * side;
    }
}