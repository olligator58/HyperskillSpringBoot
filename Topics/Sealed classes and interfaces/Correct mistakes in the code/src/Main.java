import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.nextLine());
    }
}

sealed interface ShapeInterface
        permits TriangleInterface, Triangle { }

sealed class Shape
        permits Triangle, Square { }


non-sealed interface TriangleInterface extends ShapeInterface { }

final class Triangle extends Shape implements ShapeInterface { }

non-sealed class Square extends Shape { }
