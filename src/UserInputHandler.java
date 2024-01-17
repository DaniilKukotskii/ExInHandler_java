import java.io.IOException;

public class UserInputHandler {
    public void processUserInput(String userInput) {
        try {
            String[] userData = userInput.split("\\s+");
            if (userData.length != 6) {
                throw new UserDataException("Неверное количество данных. Введите все 6 параметров.");
            }

            // Распарсить и обработать данные
            UserDataParser parser = new UserDataParser();
            User user = parser.parseUserData(userData);

            // Сохранить данные в файл
            UserFileWriter fileWriter = new UserFileWriter();
            fileWriter.writeUserDataToFile(user);
        } catch (UserDataException | IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
