import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        menu();
        int choice = readChoice();
        while (choice != 3) {
            switch (choice) {
                case 1:
                    addProductToCSV(productManager);
                    break;
                case 2:
                    readProductsFromCSV(productManager);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            choice = readChoice();
        }
    }

    // Viết phương thức hiển thị ban đầu
    public static void menu() {
        System.out.println("---Product Management---");
        System.out.println("1. Add Product Top CSV");
        System.out.println("2. View Product List");
        System.out.println("3. Exit");
    }

    public static int readChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }

    public static void addProductToCSV(ProductManager productManager) {
        Scanner scanner = new Scanner(System.in);
        Product product = new Product();
        while (true) {
            try {
                product.setName(promptForProductName(scanner));
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        product.setPrice(Double.parseDouble(promptForProductPrice(scanner)));
        productManager.addToCSV(product);
    }

    public static void readProductsFromCSV(ProductManager productManager) {
        List<Product> products = productManager.readFromCSV();
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public static String promptForProductName(Scanner scanner) {
        System.out.print("Enter product name: ");
        String name = scanner.nextLine();
        return name;
    }

    public static String promptForProductPrice(Scanner scanner) {
        while (true) {
            System.out.print("Enter product price: ");
            String price = scanner.nextLine();
            if (Pattern.matches("^[0-9]*", price)) {
                return price;
            }
        }
    }
}