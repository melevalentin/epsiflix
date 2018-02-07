package business;

public class Favoris {
    private int id;
    private int id_users;

    // Constructor
    public Favoris(int id, int id_users) {
        this.id = id;
        this.id_users = id_users;
    }

    // Getters
    public int getId() {
        return id;
    }

    public int getId_users() {
        return id_users;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setId_users(int id_users) {
        this.id_users = id_users;
    }

    // ToString method
    @Override
    public String toString() {
        return "Favoris{" +
                "id=" + id +
                ", id_users=" + id_users +
                '}';
    }
}
