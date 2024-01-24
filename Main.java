


import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String login;
        String password;
        String repeatPassword;
        do {
            System.out.println("Input login: ");
            login = scanner.nextLine();
            if (isInvalidLogin(login))
                System.err.println("login not entered correctly");
        }
        while (isInvalidLogin(login));

        do {
            System.out.println("Input password: ");
            password = scanner.nextLine();
            if (isInvalidPassword(password)) {
                System.err.println("Password not entered correctly");
            }
        }
        while (isInvalidPassword(password));

        do {
            System.out.println("Repeat password: ");
            repeatPassword = scanner.nextLine();
            if (!password.equals(repeatPassword))
                System.err.println("Password mismatch");
        }
        while (!password.equals((repeatPassword)));
        System.out.println("You are logged in");

    }

    public static boolean isInvalidLogin(String input) {
        return !input.matches("[a-e0-1_]+");
    }

    public static boolean isInvalidPassword(String input) {
        return !input.matches("[0-9]+");
    }
}