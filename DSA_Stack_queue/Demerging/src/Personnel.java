import java.time.LocalDate;

public class Personnel {
    private String name;
    private String gender; // "Nu" hoac "Nam"
    private LocalDate birthDate;

    public Personnel(String name, String gender, LocalDate birthDate) {
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return String.format("Họ tên: %-15s | Giới tính: %-5s | Ngày sinh: %s", name, gender, birthDate);
    }
}