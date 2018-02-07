package business;

public class Serie {
    private int episode_number;
    private int season_number;

    // Constructor
    public Serie(int episode_number, int season_number) {
        this.episode_number = episode_number;
        this.season_number = season_number;
    }

    // ToString method
    @Override
    public String toString() {
        return "Serie{" +
                "episode_number=" + episode_number +
                ", season_number=" + season_number +
                '}';
    }

    // Getters
    public int getEpisode_number() {
        return episode_number;
    }

    public int getSeason_number() {
        return season_number;
    }

    // Setters
    public void setEpisode_number(int episode_number) {
        this.episode_number = episode_number;
    }

    public void setSeason_number(int season_number) {
        this.season_number = season_number;
    }
}
