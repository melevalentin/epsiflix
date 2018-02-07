package business;

public class Type {
    private int id;
    private String label;

    // Constructor
    public Type(int id, String label) {
        this.id = id;
        this.label = label;
    }

    // ToString method
    @Override
    public String toString() {
        return "Type{" +
                "id=" + id +
                ", label='" + label + '\'' +
                '}';
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
