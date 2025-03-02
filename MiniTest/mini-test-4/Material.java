import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public abstract class Material {
    private String id;
    private String name;
    private LocalDate manufacturingDate;
    private int cost;

    public Material() {
    }

    public Material(String id, String name, String manufacturingDateString, int cost) {
        this.id = id;
        this.name = name;
        setManufacturingDate(manufacturingDateString); // Gọi phương thức để thiết lập ngày
        this.cost = cost;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getManufacturingDate() {
        return manufacturingDate;
    }

//    public void setManufacturingDate(LocalDate manufacturingDate) {
//        this.manufacturingDate = manufacturingDate;
//    }

    private void setManufacturingDate(String manufacturingDateString) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            this.manufacturingDate = LocalDate.parse(manufacturingDateString, formatter);
        } catch (DateTimeParseException e) {
            System.out.println("Ngày tháng không hợp lệ: " + manufacturingDateString);
            this.manufacturingDate = LocalDate.now(); // Thay thế bằng ngày hiện tại nếu không hợp lệ
        }
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public abstract double getAmount();

    public abstract LocalDate getExpiryDate();

    @Override
    public abstract String toString();
}