import java.util.Stack;

public class ReverseUtility {

    // 1. Dao nguoc phan tu trong mang so nguyen su dung Stack
    public static void reverseIntegerArray(int[] array) {
        Stack<Integer> stack = new Stack<>();

        // Buoc 2: Lan luot dua cac phan tu cua mang vao Stack (Push)
        for (int num : array) {
            stack.push(num);
        }

        // Buoc 3: Lan luot lay ra tu Stack va dua tro lai mang ban dau (Pop)
        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
    }

    // 2. Dao nguoc chuoi (Dao nguoc thu tu cac tu) su dung Stack
    public static String reverseString(String input) {
        if (input == null || input.trim().isEmpty()) {
            return input;
        }

        // Buoc 1: Tao mot wStack rong
        Stack<String> wStack = new Stack<>();

        // Buoc 2: Dung phuong thuc split() de tach cac tu tu chuoi ban dau va push vao Stack
        String[] words = input.split("\\s+"); // Tach dua tren mot hoac nhieu khoang trang
        for (String mWord : words) {
            wStack.push(mWord);
        }

        // Buoc 3: Doc tu wStack cho den het va noi vao chuoi moi
        StringBuilder outp = new StringBuilder();
        while (!wStack.isEmpty()) {
            outp.append(wStack.pop());
            if (!wStack.isEmpty()) {
                outp.append(" "); // Them khoang trang giua cac tu
            }
        }

        return outp.toString();
    }
}