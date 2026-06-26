import java.util.Stack;

public class DecimalToBinary {

    public static String convert(int decimalNumber) {
        // Trường hợp đặc biệt nếu số đầu vào là 0
        if (decimalNumber == 0) {
            return "0";
        }

        // Bước 1: Khởi tạo một Stack rỗng
        Stack<Integer> stack = new Stack<>();

        // Bước 2 + 3: Chia lấy dư cho 2 và đẩy kết quả vào Stack cho đến khi thương bằng 0
        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2; // Lấy số dư
            stack.push(remainder);             // Đẩy vào Stack
            decimalNumber = decimalNumber / 2; // Cập nhật lại thương số
        }

        // Bước 4: Đọc từ Stack cho đến hết và nối thành chuỗi kết quả
        StringBuilder binaryString = new StringBuilder();
        while (!stack.isEmpty()) {
            binaryString.append(stack.pop());
        }

        return binaryString.toString();
    }
}