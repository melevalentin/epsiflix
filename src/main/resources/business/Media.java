package business;

public class Media {
    private int id;
    private String title;
    private String subtitle;
    private String description;
    private int duration;
    private String producer;
    private String production_country;
    private String production_company;
    private int year;
    private String img_cover;
    private int id_type;

    // Constructor
    public Media(int id, String title, String subtitle, String description, int duration, String producer, String production_country, String production_company, int year, String img_cover, int id_type) {
        this.id = id;
        this.title = title;
        this.subtitle = subtitle;
        this.description = description;
        this.duration = duration;
        this.producer = producer;
        this.production_country = production_country;
        this.production_company = production_company;
        this.year = year;
        this.img_cover = img_cover;
        this.id_type = id_type;
    }

    // ToString method
    @Override
    public String toString() {
        return "Media{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", subtitle='" + subtitle + '\'' +
                ", description='" + description + '\'' +
                ", duration=" + duration +
                ", producer='" + producer + '\'' +
                ", production_country='" + production_country + '\'' +
                ", production_company='" + production_company + '\'' +
                ", year=" + year +
                ", img_cover='" + img_cover + '\'' +
                ", id_type=" + id_type +
                '}';
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public String getDescription() {
        return description;
    }

    public int getDuration() {
        return duration;
    }

    public String getProducer() {
        return producer;
    }

    public String getProduction_country() {
        return production_country;
    }

    public String getProduction_company() {
        return production_company;
    }

    public int getYear() {
        return year;
    }

    public String getImg_cover() {
        return img_cover;
    }

    public int getId_type() {
        return id_type;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setProduction_country(String production_country) {
        this.production_country = production_country;
    }

    public void setProduction_company(String production_company) {
        this.production_company = production_company;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setImg_cover(String img_cover) {
        this.img_cover = img_cover;
    }

    public void setId_type(int id_type) {
        this.id_type = id_type;
    }
}
