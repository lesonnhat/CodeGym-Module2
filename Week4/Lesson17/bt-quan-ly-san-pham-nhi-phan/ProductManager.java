import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    private static final String FILE_NAME = "products.dat";
    private List<Product> products;

    public ProductManager() {
        products = new ArrayList<>();
        loadProducts();
    }

    public void addProduct(Product product) {
        products.add(product);
        saveProducts();
    }

    public void displayProducts() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public Product findProductById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    private void saveProducts() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(products);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    private void loadProducts() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            products = (List<Product>) ois.readObject();
        } catch (EOFException e) {
            // Tệp trống, không có sản phẩm nào để tải
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}