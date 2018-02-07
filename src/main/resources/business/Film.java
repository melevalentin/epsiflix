package business;

public class Film {
    private int id;
    private String url;

    // Constructor
    public Film(int id, String url) {
        this.id = id;
        this.url = url;
    }

    // ToString methods
    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", url='" + url + '\'' +
                '}';
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
