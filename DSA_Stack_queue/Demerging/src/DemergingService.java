import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DemergingService {

    public static List<Personnel> reorderPersonnel(List<Personnel> originalList) {
        // Buoc 1: Tao 2 queue rong co ten lan luot la NU va NAM
        Queue<Personnel> NU = new LinkedList<>();
        Queue<Personnel> NAM = new LinkedList<>();

        // Buoc 2: Duyet tung ban ghi p, phan loai dua vao queue tuong ung
        for (Personnel p : originalList) {
            if (p.getGender().equalsIgnoreCase("Nu")) {
                NU.add(p);
            } else if (p.getGender().equalsIgnoreCase("Nam")) {
                NAM.add(p);
            }
        }

        // Tạo một danh sách mới để lưu kết quả đầu ra (Thay thế cho file output)
        List<Personnel> outputList = new LinkedList<>();

        // Buoc 3: Lay tung phan tu trong queue NU ghi vao output cho den khi rong
        while (!NU.isEmpty()) {
            outputList.add(NU.poll()); // poll() lay va xoa phan tu o dau queue
        }

        // Buoc 4: Lay tiep tung phan tu trong queue NAM ghi vao sau hang Nu
        while (!NAM.isEmpty()) {
            outputList.add(NAM.poll());
        }

        // Buoc 5: Ket thuc giai thuat, tra ve ket qua da to chuc lai
        return outputList;
    }
}