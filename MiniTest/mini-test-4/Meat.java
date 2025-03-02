import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Meat extends Material implements Discount {
    private double weight;

    public Meat() {
    }

    public Meat(String id, String name, String manufacturingDateString, int cost, double weight) {
        super(id, name, manufacturingDateString, cost);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getAmount() {
        return weight * getCost();
    }

    @Override
    public double getRealMoney() {
        return weight * getCost() * 0.9;
    }

    @Override
    public LocalDate getExpiryDate() {
        return getManufacturingDate().plusDays(7);
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "{ID: " + getId() + ", Name: " + getName() + ", EXP: " + getExpiryDate().format(formatter) + ", Cost: " + getCost() + " VNĐ, Weight: " + getWeight() + " kg}";
    }
}
