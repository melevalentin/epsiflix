package business;

public class Subscription {
    private int id;
    private String label;
    private double price;
    private String description;

    // Constructor
    public Subscription(int id, String label, double price, String description) {
        this.id = id;
        this.label = label;
        this.price = price;
        this.description = description;
    }

    // ToString method
    @Override
    public String toString() {
        return "Subscription{" +
                "id=" + id +
                ", label='" + label + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
