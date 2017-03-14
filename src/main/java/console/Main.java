package console;

import model.User;
import service.DataService;
import service.UserService;

import java.util.Scanner;

/**
 * Created by RENT on 2017-03-13.
 */
public class Main {
    private static Object xmlString;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        login(scanner);

        DataService dataService = new DataService();
        User user = new User;
        String xmlUser =
        dataService.saveData(xmlString);
    }

    private static void login(Scanner scanner) {
        System.out.println("Login:");
        String login = scanner.nextLine();
        System.out.println("Password");
        String password = scanner.nextLine();

        User user = new User(login, password);

        UserService userService = new UserService();
        if (userService.authenticate(user)) {
            System.out.println("Zalogowany");
        } else {
            System.out.println("Nieprawidlowe haslo");
        }
    }
}
