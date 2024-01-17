import java.text.ParseException;
import java.text.SimpleDateFormat;

public class UserDataParser {
    public User parseUserData(String[] userData) throws UserDataException {
        try {
            String surname = userData[0];
            String name = userData[1];
            String patronymic = userData[2];
            String birthDateStr = userData[3];
            long phoneNumber = Long.parseLong(userData[4]);
            char gender = userData[5].charAt(0);

            // Проверка формата даты
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
            dateFormat.setLenient(false);
            dateFormat.parse(birthDateStr);

            // Проверка формата пола
            if (gender != 'f' && gender != 'm') {
                throw new UserDataException("Неверный формат пола. Используйте 'f' или 'm'.");
            }

            // Создание объекта пользователя
            return new User(surname, name, patronymic, birthDateStr, phoneNumber, gender);
        } catch (ParseException | NumberFormatException | ArrayIndexOutOfBoundsException e) {
            throw new UserDataException("Неверный формат данных. Проверьте введенные значения.");
        }
    }
}
