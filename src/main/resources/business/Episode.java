package business;

public class Episode {
    private int id;
    private String title;
    private String description;
    private int duration;
    private String url;
    private String id_media;

    // Constructor
    public Episode(int id, String title, String description, int duration, String url, String id_media) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.duration = duration;
        this.url = url;
        this.id_media = id_media;
    }

    //Getters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getDuration() {
        return duration;
    }

    public String getUrl() {
        return url;
    }

    public String getId_media() {
        return id_media;
    }

    //Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setId_media(String id_media) {
        this.id_media = id_media;
    }

    // ToString method
    @Override
    public String toString() {
        return "Episode{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", duration=" + duration +
                ", url='" + url + '\'' +
                ", id_media='" + id_media + '\'' +
                '}';
    }
}
