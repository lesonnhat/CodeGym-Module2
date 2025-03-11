import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductManager implements IManager<Product> {
    public static final String FILE_NAME = "products.dat";
    private static File file = new File(FILE_NAME);
    private List<Product> products = new ArrayList<Product>();

    public ProductManager() {
    }

    @Override
    public void addToCSV(Product product) {
        try {
            FileOutputStream fos = new FileOutputStream(FILE_NAME, true);
            if (file.length() == 0) {
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(product);
                oos.close();
            } else {
                MyObjectOutputStream oos = null;
                oos = new MyObjectOutputStream(fos);
                oos.writeObject(product);
                oos.close();
            }
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Product> readFromCSV() {
        products.clear();
        try {
            FileInputStream fis = new FileInputStream(FILE_NAME);
            ObjectInputStream ois = new ObjectInputStream(fis);
            while (fis.available() > 0) {
                Product product = (Product) ois.readObject();
                products.add(product);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return products;
    }
}
