public class MyQueue {
    private int capacity;
    private int queueArr[];
    private int head = 0;
    private int tail = -1;
    private int currentSize = 0;

    // Bước 1: Phương thức khởi tạo cấu hình kích thước hàng đợi
    public MyQueue(int queueSize) {
        this.capacity = queueSize;
        queueArr = new int[this.capacity];
    }

    // Bước 2: Kiểm tra hàng đợi đã đầy hay chưa
    public boolean isQueueFull() {
        boolean status = false;
        if (currentSize == capacity) {
            status = true;
        }
        return status;
    }

    // Bước 3: Kiểm tra hàng đợi có rỗng hay không
    public boolean isQueueEmpty() {
        boolean status = false;
        if (currentSize == 0) {
            status = true;
        }
        return status;
    }

    // Bước 4: Thêm một phần tử vào cuối hàng đợi (Enqueue)
    public void enqueue(int item) {
        if (isQueueFull()) {
            System.out.println("Overflow ! Unable to add element: " + item);
        } else {
            // Tịnh tiến và quay vòng chỉ mục tail bằng toán tử chia lấy dư
            tail = (tail + 1) % capacity;
            queueArr[tail] = item;
            currentSize++;
            System.out.println("Element " + item + " is pushed to Queue !");
        }
    }

    // Bước 5: Xóa một phần tử khỏi đầu hàng đợi (Dequeue)
    public void dequeue() {
        if (isQueueEmpty()) {
            System.out.println("Underflow ! Unable to remove element from Queue");
        } else {
            // Cải tiến logic chính xác cho việc dịch chuyển vòng tròn của head
            int removedItem = queueArr[head];
            head = (head + 1) % capacity;
            currentSize--;
            System.out.println("Pop operation done ! removed: " + removedItem);
        }
    }
}