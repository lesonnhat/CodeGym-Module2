import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CrispyFlour extends Material implements Discount {
    private double quantity;

    public CrispyFlour() {
    }

    public CrispyFlour(String id, String name, String manufacturingDateString, int cost, double quantity) {
        super(id, name, manufacturingDateString, cost);
        this.quantity = quantity;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @Override
    public double getAmount() {
        return quantity * getCost();
    }

    @Override
    public double getRealMoney() {
        return quantity * getCost() * 0.95;
    }

    @Override
    public LocalDate getExpiryDate() {
        return getManufacturingDate().plusYears(1);
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "{ID: " + getId() + ", Name: " + getName() + ", EXP: " + getExpiryDate().format(formatter) + ", Cost: " + getCost() + " VNĐ, Quantity: " + getQuantity() + "}";
    }
}
