import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Hiển thị sản phẩm");
            System.out.println("3. Tìm kiếm sản phẩm theo ID");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Đọc dòng còn lại

            switch (choice) {
                case 1:
                    System.out.print("Nhập mã sản phẩm: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Đọc dòng còn lại
                    System.out.print("Nhập tên sản phẩm: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhập giá sản phẩm: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine(); // Đọc dòng còn lại
                    System.out.print("Nhập hãng sản xuất: ");
                    String manufacturer = scanner.nextLine();
                    System.out.print("Nhập mô tả: ");
                    String description = scanner.nextLine();

                    Product product = new Product(id, name, price, manufacturer, description);
                    productManager.addProduct(product);
                    break;

                case 2:
                    productManager.displayProducts();
                    break;

                case 3:
                    System.out.print("Nhập mã sản phẩm để tìm: ");
                    int searchId = scanner.nextInt();
                    Product foundProduct = productManager.findProductById(searchId);
                    if (foundProduct != null) {
                        System.out.println("Sản phẩm tìm thấy: " + foundProduct);
                    } else {
                        System.out.println("Không tìm thấy sản phẩm với mã ID " + searchId);
                    }
                    break;

                case 0:
                    System.out.println("Thoát chương trình.");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }
        } while (choice != 0);

        scanner.close();
    }
}