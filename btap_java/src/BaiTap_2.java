import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BaiTap_2 {
    // Hàm phụ trợ: Kiểm tra số nguyên tố
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> danhSach = new ArrayList<>();
        int chon = 0;

        do {
            System.out.println("\n========== MENU ==========");
            System.out.println("1. Nhập danh sách số nguyên (không trùng)");
            System.out.println("2. Xuất danh sách");
            System.out.println("3. Tìm kiếm giá trị bất kỳ");
            System.out.println("4. Xuất các số nguyên tố");
            System.out.println("5. Sắp xếp danh sách (dùng Collections.sort)");
            System.out.println("6. Xóa một giá trị bất kỳ");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");

            try {
                chon = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                chon = -1;
            }

            switch (chon) {
                case 1:
                    System.out.print("Bạn muốn nhập bao nhiêu số? ");
                    int soLuong = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < soLuong; i++) {
                        System.out.print("Nhập số thứ " + (i + 1) + ": ");
                        int so = Integer.parseInt(sc.nextLine());

                        // Kiểm tra không trùng nhau trước khi thêm vào ArrayList
                        if (!danhSach.contains(so)) {
                            danhSach.add(so);
                        } else {
                            System.out.println(" -> Lỗi: Số này đã tồn tại. Vui lòng nhập số khác!");
                            i--; // Bắt vòng lặp chạy lại bước hiện tại
                        }
                    }
                    break;

                case 2:
                    if (danhSach.isEmpty()) {
                        System.out.println("Danh sách đang rỗng!");
                    } else {
                        System.out.println("Danh sách hiện tại: " + danhSach);
                    }
                    break;

                case 3:
                    System.out.print("Nhập giá trị cần tìm: ");
                    int soTimKiem = Integer.parseInt(sc.nextLine());
                    if (danhSach.contains(soTimKiem)) {
                        System.out.println("=> Số " + soTimKiem + " CÓ TỒN TẠI ở vị trí index: " + danhSach.indexOf(soTimKiem));
                    } else {
                        System.out.println("=> Số " + soTimKiem + " KHÔNG TỒN TẠI trong tập hợp.");
                    }
                    break;

                case 4:
                    System.out.print("Các số nguyên tố trong tập hợp: ");
                    boolean coSoNguyenTo = false;
                    for (int so : danhSach) {
                        if (isPrime(so)) {
                            System.out.print(so + " ");
                            coSoNguyenTo = true;
                        }
                    }
                    if (!coSoNguyenTo) {
                        System.out.print("Không có số nguyên tố nào!");
                    }
                    System.out.println();
                    break;

                case 5:
                    // Sử dụng Collections.sort theo yêu cầu đề bài
                    Collections.sort(danhSach);
                    System.out.println("=> Đã sắp xếp tăng dần thành công!");
                    System.out.println("Danh sách sau sắp xếp: " + danhSach);
                    break;

                case 6:
                    System.out.print("Nhập giá trị muốn xóa: ");
                    int soCanXoa = Integer.parseInt(sc.nextLine());

                    // LƯU Ý QUAN TRỌNG:
                    // Phải bọc số nguyên trong Integer.valueOf().
                    // Nếu dùng danhSach.remove(soCanXoa), Java sẽ hiểu 'soCanXoa' là vị trí Index chứ không phải giá trị.
                    if (danhSach.remove(Integer.valueOf(soCanXoa))) {
                        System.out.println("=> Đã xóa thành công số " + soCanXoa);
                    } else {
                        System.out.println("=> Không tìm thấy số " + soCanXoa + " để xóa.");
                    }
                    break;

                case 0:
                    System.out.println("Đã thoát chương trình.");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng thử lại!");
            }
        } while (chon != 0);

        sc.close();
    }
}
