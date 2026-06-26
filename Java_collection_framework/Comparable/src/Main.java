import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Kien", 30, "HT");
        Student student1 = new Student("Nam", 26, "HN");
        Student student2 = new Student("Anh", 38, "HT");
        Student student3 = new Student("Tung", 38, "HT");

        List<Student> lists = new ArrayList<Student>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);

        // 1. Sắp xếp mặc định bằng Comparable (Theo Tên)
        System.out.println("--- Sap xep theo ten (Comparable) ---");
        Collections.sort(lists);
        for (Student st : lists) {
            System.out.println(st.toString());
        }

        // 2. Sắp xếp tùy chỉnh bằng Comparator (Theo Tuổi)
        System.out.println("\n--- So sanh theo tuoi (Comparator) ---");
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists, ageComparator);
        for (Student st : lists) {
            System.out.println(st.toString());
        }
    }
}