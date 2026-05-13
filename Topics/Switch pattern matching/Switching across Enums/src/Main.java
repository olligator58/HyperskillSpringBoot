import java.util.Scanner;

sealed interface Command permits SimpleCommand, CustomCommand {
}

enum SimpleCommand implements Command {
    START, STOP, PAUSE
}

final class CustomCommand implements Command {
    String description;

    CustomCommand(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

public class Main {
    public static void processCommand(Command cmd) {
        switch (cmd) {
            case SimpleCommand.START -> System.out.println("System starting");
            case SimpleCommand.STOP -> System.out.println("System stopping");
            case SimpleCommand.PAUSE -> System.out.println("System paused");
            case CustomCommand c -> System.out.println("Custom command.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim().toUpperCase();

        Command command;
        try {
            command = SimpleCommand.valueOf(input);
        } catch (IllegalArgumentException e) {
            command = new CustomCommand(input);
        }

        processCommand(command);

        scanner.close();
    }
}