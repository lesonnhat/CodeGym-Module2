import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PersonManager manager = new PersonManager();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            menu();
            System.out.print("→ Chọn chức năng: ");

            while (!sc.hasNextInt()) {
                System.out.print("Vui lòng nhập một số nguyên hợp lệ.\n → Chọn chức năng: ");
                sc.next();
            }

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    manager.add();
                    break;
                case 2:
                    manager.delete();
                    break;
                case 3:
                    manager.display();
                    break;
                case 4:
                    manager.search();
                    break;
                case 5:
                    System.out.println("Cảm ơn, hẹn gặp lại!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
            }
        } while (choice != 5);

        sc.close();
    }

    private static void menu() {
        System.out.println("---CHƯƠNG TRÌNH QUẢN LÝ LỚP HỌC---");
        System.out.println("1. Thêm mới sinh viên");
        System.out.println("2. Xóa sinh viên");
        System.out.println("3. Xem danh sách sinh viên");
        System.out.println("4. Tìm kiếm sinh viên");
        System.out.println("5. Thoát");
    }
}