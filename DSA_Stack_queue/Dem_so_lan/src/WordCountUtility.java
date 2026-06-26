import java.util.Map;
import java.util.TreeMap;

public class WordCountUtility {

    public static Map<String, Integer> countWords(String text) {
        // Cấu trúc TreeMap tự động sắp xếp key theo thứ tự bảng chữ cái (A-Z)
        Map<String, Integer> wordMap = new TreeMap<>();

        if (text == null || text.trim().isEmpty()) {
            return wordMap;
        }

        // Bước 1: Chuyển toàn bộ chuỗi thành chữ thường và tách từ dựa trên khoảng trắng
        // Đồng thời loại bỏ các dấu câu cơ bản như , . ! ? bằng regex
        String cleanText = text.toLowerCase().replaceAll("[.,\/#!$%\^&\*;:{}=\-_`~()!?]", "");
        String[] words = cleanText.split("\\s+");

        // Bước 2: Duyệt toàn bộ từ trong mảng
        for (String word : words) {
            if (word.isEmpty()) continue; // Bỏ qua khoảng trắng thừa nếu có

            // Bước 3: Kiểm tra key trong map và cập nhật value
            if (wordMap.containsKey(word)) {
                // Nếu đã có, tăng số lượng lên 1
                wordMap.put(word, wordMap.get(word) + 1);
            } else {
                // Nếu chưa có, mặc định gán số lượng là 1
                wordMap.put(word, 1);
            }
        }

        return wordMap;
    }
}