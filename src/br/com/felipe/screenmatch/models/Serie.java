package br.com.felipe.screenmatch.models;

public class Serie extends Media {
    private int season;
    private boolean active;
    private int episodesPerSeason;
    private int minutesPerEpisode;

    public Serie(String name, int releaseYear){
        super(name, releaseYear);
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setEpisodesPerSeason(int episodesPerSeason) {
        this.episodesPerSeason = episodesPerSeason;
    }

    public void setMinutesPerEpisode(int minutesPerEpisode) {
        this.minutesPerEpisode = minutesPerEpisode;
    }

    @Override
    public int getTotalMinutes() {
        return this.season * this.episodesPerSeason * this.minutesPerEpisode;
    }

    @Override
    public String toString() {
        return "Serie: " + this.getName();
    }
}
