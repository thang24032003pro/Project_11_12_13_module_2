import java.util.Stack;

public class BracketChecker {

    public static boolean checkBrackets(String expression) {
        if (expression == null) {
            return false;
        }

        // Bước 1: Tạo một bStack rỗng để chứa các dấu ngoặc mở
        Stack<Character> bStack = new Stack<>();

        // Bước 2: Duyệt từng ký tự (sym) trong biểu thức từ trái sang phải
        for (int i = 0; i < expression.length(); i++) {
            char sym = expression.charAt(i);

            // 2.1. Nếu sym là dấu ngoặc trái: Đưa vào bStack
            if (sym == '(') {
                bStack.push(sym);
            } 
            // 2.2. Nếu sym là dấu ngoặc phải
            else if (sym == ')') {
                // 2.2.1. Nếu bStack rỗng, nghĩa là có ngoặc đóng mà thiếu ngoặc mở tương ứng
                if (bStack.isEmpty()) {
                    return false;
                }
                
                // 2.2.2. Lấy dấu ngoặc mở ở đỉnh bStack ra (biến left)
                char left = bStack.pop();
                
                // 2.2.3. Kiểm tra xem cặp dấu ngoặc có khớp nhau không (ở đây chỉ xét cặp '(' và ')')
                if (left != '(') {
                    return false;
                }
            }
        }

        // Bước 3: Nếu bStack rỗng tức là tất cả dấu ngoặc đều khớp cặp -> đúng (true).
        // Ngược lại nếu vẫn còn dấu ngoặc dư thừa -> sai (false).
        return bStack.isEmpty();
    }
}