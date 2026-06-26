public class MyStack {
    private int arr[];
    private int size;
    private int index = 0;

    // Bước 1: Khởi tạo kích thước tối đa cho Stack
    public MyStack(int size) {
        this.size = size;
        this.arr = new int[size];
    }

    // Bước 2: Chèn phần tử mới vào đỉnh Stack (Push)
    public void push(int element) {    
        if (isFull()) {       
            throw new StackOverflowError("Stack is full");    
        }     
        arr[index++] = element; // Gán phần tử vào vị trí index hiện tại rồi tăng index lên 1
    }

    // Bước 3: Xóa và trả về phần tử ở đỉnh Stack (Pop)
    public int pop() throws Exception {
        if (isEmpty()) { 
            throw new Exception("Stack is empty");
        }
        return arr[--index]; // Giảm chỉ mục index trước rồi lấy giá trị ra
    }

    // Bước 4: Trả về số lượng phần tử hiện tại trong Stack
    public int size() {
        return index;
    }

    // Bước 5: Kiểm tra xem Stack có đang rỗng không
    public boolean isEmpty() {
        return index == 0;
    }

    // Bước 6: Kiểm tra xem Stack đã đầy bộ nhớ chưa
    public boolean isFull() {
        return index == size;
    }
}