import java.io.FileWriter;
import java.io.IOException;

public class UserFileWriter {
    public void writeUserDataToFile(User user) throws IOException {
        try (FileWriter writer = new FileWriter(user.getSurname() + ".txt", true)) {
            writer.write(user.toFileString() + "\n");
        } catch (IOException e) {
            throw new IOException("Ошибка записи в файл: " + e.getMessage());
        }
    }
}
