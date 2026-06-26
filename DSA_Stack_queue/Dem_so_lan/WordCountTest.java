import java.util.Map;

public class WordCountTest {
    public static void main(String[] args) {
        System.out.println("=== CHƯƠNG TRÌNH ĐẾM TỪ SỬ DỤNG TREEMAP ===");

        // Chuỗi văn bản mẫu kiểm thử
        String paragraph = "Java is a programming language. Python is also a programming language! Java is powerful.";
        System.out.println("Văn bản gốc: \"" + paragraph + "\"\n");

        // Thực thi đếm từ
        Map<String, Integer> result = WordCountUtility.countWords(paragraph);

        // Hiển thị kết quả (TreeMap sẽ tự động in theo thứ tự A-Z của từ)
        System.out.println("Kết quả đếm từ (Sắp xếp theo thứ tự bảng chữ cái):");
        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            System.out.println("Từ '" + entry.getKey() + "' xuất hiện: " + entry.getValue() + " lần.");
        }
    }
}