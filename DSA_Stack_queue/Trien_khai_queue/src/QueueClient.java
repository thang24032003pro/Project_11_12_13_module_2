public class QueueClient {
    public static void main(String[] args) {
        // Khởi tạo hàng đợi có sức chứa tối đa là 4 phần tử
        MyQueue queue = new MyQueue(4);

        System.out.println("=== BẮT ĐẦU KIỂM THỬ HÀNG ĐỢI ===");
        queue.enqueue(4);
        queue.dequeue();
        
        queue.enqueue(56);
        queue.enqueue(2);
        queue.enqueue(67);
        queue.dequeue();
        queue.dequeue();
        
        queue.enqueue(24);
        queue.dequeue();
        
        queue.enqueue(98);
        queue.enqueue(45);
        queue.enqueue(23);
        queue.enqueue(435); // Thử đẩy phần tử vượt ngưỡng kích thước
    }
}