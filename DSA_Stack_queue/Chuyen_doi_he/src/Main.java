public class Main {
    public static void main(String[] args) {
        System.out.println("=== CHƯƠNG TRÌNH CHUYỂN ĐỔI THẬP PHÂN SANG NHỊ PHÂN ===");

        // Thử nghiệm trường hợp 1: Số 30 (Kỳ vọng kết quả: 11110)
        int num1 = 30;
        String binary1 = DecimalToBinary.convert(num1);
        System.out.println("Số thập phân: " + num1 + " => Hệ nhị phân: " + binary1);

        // Thử nghiệm trường hợp 2: Số 111
        int num2 = 111;
        String binary2 = DecimalToBinary.convert(num2);
        System.out.println("Số thập phân: " + num2 + " => Hệ nhị phân: " + binary2);
    }
}