import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeChecker {

    public static boolean isPalindrome(String input) {
        if (input == null) {
            return false;
        }

        // Loại bỏ khoảng trắng và chuyển về chữ thường để so sánh không phân biệt hoa thường
        // (Ví dụ: "Able was I ere I saw Elba" vẫn được tính là đối xứng)
        String cleanInput = input.replaceAll("\\s+", "").toLowerCase();

        // Khởi tạo Stack và Queue
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Bước 1: Đọc từng ký tự của chuỗi vào cả stack và queue
        for (int i = 0; i < cleanInput.length(); i++) {
            char c = cleanInput.charAt(i);
            stack.push(c);
            queue.add(c);
        }

        // Bước 2: So sánh từng phần tử được lấy ra từ cặp đôi này
        while (!stack.isEmpty()) {
            // pop() lấy từ cuối lên (ngược), remove() lấy từ đầu xuống (xuôi)
            if (!stack.pop().equals(queue.remove())) {
                return false; // Phát hiện cặp ký tự khác nhau -> Không phải Palindrome
            }
        }

        return true; // Tất cả các cặp trùng nhau
    }
}