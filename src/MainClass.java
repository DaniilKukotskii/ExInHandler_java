import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            UserInputHandler inputHandler = new UserInputHandler();

            System.out.println("Добро пожаловать!");

            // Запрос на ввод каждого параметра
            System.out.print("Введите фамилию: ");
            String surname = scanner.nextLine();

            System.out.print("Введите имя: ");
            String name = scanner.nextLine();

            System.out.print("Введите отчество: ");
            String patronymic = scanner.nextLine();

            System.out.print("Введите дату рождения (в формате dd.mm.yyyy): ");
            String birthDate = scanner.nextLine();

            System.out.print("Введите номер телефона: ");
            long phoneNumber = Long.parseLong(scanner.nextLine());

            System.out.print("Введите пол (f/m): ");
            char gender = scanner.nextLine().charAt(0);

            // Обработка введенных данных
            inputHandler.processUserInput(String.format("%s %s %s %s %d %c", surname, name, patronymic, birthDate, phoneNumber, gender));

            // Закрытие ресурсов
            scanner.close();
        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
