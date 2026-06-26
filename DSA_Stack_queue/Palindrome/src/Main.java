public class Main {
    public static void main(String[] args) {
        System.out.println("=== CHƯƠNG TRÌNH KIỂM TRA CHUỖI PALINDROME ===");

        // Thử nghiệm 1: Chuỗi đối xứng kinh điển (có viết hoa thường xen kẽ)
        String str1 = "Able was I ere I saw Elba";
        System.out.println("Chuỗi 1: \"" + str1 + "\"");
        System.out.println("Kết quả: " + (PalindromeChecker.isPalindrome(str1) ? "Là chuỗi Palindrome" : "KHÔNG phải Palindrome"));

        // Thử nghiệm 2: Chuỗi thông thường
        System.out.println();
        String str2 = "CodeGym Vietnam";
        System.out.println("Chuỗi 2: \"" + str2 + "\"");
        System.out.println("Kết quả: " + (PalindromeChecker.isPalindrome(str2) ? "Là chuỗi Palindrome" : "KHÔNG phải Palindrome"));
        
        // Thử nghiệm 3: Chuỗi ngắn đối xứng ngắn
        System.out.println();
        String str3 = "Radar";
        System.out.println("Chuỗi 3: \"" + str3 + "\"");
        System.out.println("Kết quả: " + (PalindromeChecker.isPalindrome(str3) ? "Là chuỗi Palindrome" : "KHÔNG phải Palindrome"));
    }
}