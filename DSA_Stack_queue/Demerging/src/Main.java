import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== CHƯƠNG TRÌNH PHÂN TÁCH NHÂN SỰ (DEMERGING) ===");

        // Gia su du lieu goc da sap xep theo thu tu Ngay sinh tang dan
        List<Personnel> originalData = new ArrayList<>();
        originalData.add(new Personnel("Nguyễn Văn A", "Nam", LocalDate.of(1990, 5, 12)));
        originalData.add(new Personnel("Trần Thị B",   "Nu",  LocalDate.of(1992, 8, 24)));
        originalData.add(new Personnel("Lê Văn C",     "Nam", LocalDate.of(1995, 1, 3)));
        originalData.add(new Personnel("Phạm Minh D",   "Nam", LocalDate.of(1998, 11, 15)));
        originalData.add(new Personnel("Hoàng Thu E",  "Nu",  LocalDate.of(2000, 3, 30)));

        System.out.println("\n--- Dữ liệu gốc ban đầu (Đã xếp theo ngày sinh): ---");
        for (Personnel p : originalData) {
            System.out.println(p);
        }

        // Thuc thi giai thuat Demerging
        List<Personnel> reorderedData = DemergingService.reorderPersonnel(originalData);

        System.out.println("\n--- Dữ liệu sau khi xử lý (Nữ trước, Nam sau): ---");
        for (Personnel p : reorderedData) {
            System.out.println(p);
        }
    }
}