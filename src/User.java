import java.util.StringJoiner;

public class User {
    private String surname;
    private String name;
    private String patronymic;
    private String birthDate;
    private long phoneNumber;
    private char gender;

    public User(String surname, String name, String patronymic, String birthDate, long phoneNumber, char gender) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public String getSurname() {
        return surname;
    }

    public String toFileString() {
        StringJoiner joiner = new StringJoiner(" ");
        joiner.add(surname).add(name).add(patronymic).add(birthDate).add(String.valueOf(phoneNumber)).add(String.valueOf(gender));
        return joiner.toString();
    }
}