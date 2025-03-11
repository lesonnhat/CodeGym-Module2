import java.io.Serializable;
import java.util.regex.Pattern;

public class Product implements Serializable {
    private static final long serialVersionUID = 1L; // Required for serialization
    private String name;
    private double price;

    public Product() {
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!Pattern.matches("^[a-zA-Z0-9]*", name)) {
            throw new IllegalArgumentException("Name Illegal !");
        }
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
