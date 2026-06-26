import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> stack;

    // Buớc 1: Khởi tạo Stack rỗng
    public MyGenericStack() {
        stack = new LinkedList<>();
    }

    // Bước 2: Đẩy phần tử vào đầu Stack (Tương đương addFirst)
    public void push(T element) {
        stack.addFirst(element);
    }

    // Bước 3: Lấy và xóa phần tử ở đỉnh Stack (Tương đương removeFirst)
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    // Bước 4: Trả về số lượng phần tử hiện tại
    public int size() {
        return stack.size();
    }

    // Bước 5: Kiểm tra Stack có rỗng hay không
    public boolean isEmpty() {
        return stack.size() == 0;
    }
}