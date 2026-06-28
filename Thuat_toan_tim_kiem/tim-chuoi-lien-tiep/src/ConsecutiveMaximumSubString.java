import java.util.LinkedList;
import java.util.Scanner;

public class ConsecutiveMaximumSubString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String string = scanner.nextLine();

        // Danh sách lưu trữ chuỗi con tăng dần dài nhất được tìm thấy
        LinkedList<Character> maxList = new LinkedList<>();

        // Danh sách lưu trữ chuỗi con tăng dần đang được kiểm tra (tạm thời)
        LinkedList<Character> tempList = new LinkedList<>();

        // Duyệt qua từng ký tự của chuỗi đầu vào theo cơ chế liên tiếp
        for (int i = 0; i < string.length(); i++) {
            char currentChar = string.charAt(i);

            // Nếu danh sách tạm không trống và ký tự hiện tại nhỏ hơn hoặc bằng ký tự trước
            // đó,
            // nghĩa là tính liên tiếp tăng dần bị ngắt quãng -> Reset lại danh sách tạm
            if (!tempList.isEmpty() && currentChar <= tempList.getLast()) {
                tempList.clear();
            }

            tempList.add(currentChar);

            // Cập nhật kết quả lớn nhất nếu chuỗi liên tiếp hiện tại dài hơn chuỗi kỷ lục
            // cũ
            if (tempList.size() > maxList.size()) {
                maxList.clear();
                maxList.addAll(tempList);
            }
        }

        // Hiển thị kết quả chuỗi con tăng dần lớn nhất
        System.out.print("Chuỗi tăng dần lớn nhất: ");
        for (Character ch : maxList) {
            System.out.print(ch);
        }
        System.out.println();
        scanner.close();
    }
}