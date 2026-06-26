public class StackClient {
    public static void main(String[] args) throws Exception {
        // Khởi tạo Stack có sức chứa tối đa là 5 phần tử
        MyStack stack = new MyStack(5);

        System.out.println("=== KIỂM TRA TRẠNG THÁI ĐẦY ===");
        System.out.println("Stack đã đầy chưa? " + stack.isFull());

        // Đẩy 5 phần tử vào Stack
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        System.out.println("\n=== SAU KHI ĐẨY ĐỦ 5 PHẦN TỬ ===");
        System.out.println("1. Size of stack after push operations: " + stack.size());
        System.out.println("Stack đã đầy chưa? " + stack.isFull());
        
        System.out.print("2. Pop elements from stack : ");
        // Lấy dữ liệu ra theo cơ chế LIFO (Vào sau - Ra trước)
        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        }

        System.out.println("\n3. Size of stack after pop operations : " + stack.size());
        System.out.println("Stack đã đầy chưa? " + stack.isFull());
    }
}