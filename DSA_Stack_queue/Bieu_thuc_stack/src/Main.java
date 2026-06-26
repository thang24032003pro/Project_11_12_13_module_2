public class Main {
    public static void main(String[] args) {
        System.out.println("=== CHƯƠNG TRÌNH KIỂM TRA DẤU NGOẶC TRONG BIỂU THỨC ===");

        // Các biểu thức kiểm thử từ đề bài
        String expr1 = "s (s – a) (s – b) (s – c)";
        String expr2 = "(– b + (b2 – 4a*c)^0.5) / 2*a";
        String expr3 = "s (s – a) (s – b (s – c)";
        String expr4 = "s (s – a) s – b) (s – c)";
        String expr5 = "(– b + (b^2 – 4*a*c)^(0.5/ 2*a))";

        System.out.println("1. \"" + expr1 + "\" -> " + (BracketChecker.checkBrackets(expr1) ? "Well (Hợp lệ)" : "Invalid (Lỗi)"));
        System.out.println("2. \"" + expr2 + "\" -> " + (BracketChecker.checkBrackets(expr2) ? "Well (Hợp lệ)" : "Invalid (Lỗi)"));
        System.out.println("3. \"" + expr3 + "\" -> " + (BracketChecker.checkBrackets(expr3) ? "Well (Hợp lệ)" : "Invalid (Lỗi)"));
        System.out.println("4. \"" + expr4 + "\" -> " + (BracketChecker.checkBrackets(expr4) ? "Well (Hợp lệ)" : "Invalid (Lỗi)"));
        System.out.println("5. \"" + expr5 + "\" -> " + (BracketChecker.checkBrackets(expr5) ? "Well (Hợp lệ)" : "Invalid (Lỗi)"));
    }
}