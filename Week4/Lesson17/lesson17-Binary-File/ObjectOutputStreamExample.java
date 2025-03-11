import java.io.*;

public class ObjectOutputStreamExample {
    public static void main(String[] args) throws IOException {

        // Sử dụng ObjectOutputStream để ghi đối tượng vào file
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("product.txt"));
            Product product = new Product(1, "IPhone 12", 28500000, "New");
            oos.writeObject(product);
            oos.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            oos.close();
        }
        System.out.println("Success!");

        // Sử dụng ObjectInputStream để đọc đối tượng từ file
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("product.txt"));
            Product product = (Product) ois.readObject();
            System.out.println(product);
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        } finally {
            ois.close();
        }
    }
}