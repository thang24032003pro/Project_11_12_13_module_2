import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
        // --- THU NGHIEM 1: Dao nguoc mang so nguyen ---
        System.out.println("=== 1. DAO NGUOC MANG SO NGUYEN ===");
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Mang ban dau: " + Arrays.toString(numbers));
        
        ReverseUtility.reverseIntegerArray(numbers);
        System.out.println("Mang sau khi dao nguoc: " + Arrays.toString(numbers));

        
        // --- THU NGHIEM 2: Dao nguoc chuoi (Theo tung tu) ---
        System.out.println("\n=== 2. DAO NGUOC CHUOI ===");
        String text = "Lap trinh Java voi CodeGym";
        System.out.println("Chuoi ban dau: \"" + text + "\"");
        
        String reversedText = ReverseUtility.reverseString(text);
        System.out.println("Chuoi sau khi dao nguoc: \"" + reversedText + "\"");
    }
}