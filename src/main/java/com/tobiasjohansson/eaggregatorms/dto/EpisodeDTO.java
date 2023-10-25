package com.tobiasjohansson.eaggregatorms.dto;


public class EpisodeDTO {
    private int id;
    private String name;
    private GenreDTO genre;
    private String releaseDate;
    private MediaTypeDTO mediaType;
    private String url;
    private SeasonDTO season;
    private PodhostDTO podhost;

    public EpisodeDTO() {
    }

    public EpisodeDTO(int id, String name, GenreDTO genre, String releaseDate, MediaTypeDTO mediaType, String url, SeasonDTO season, PodhostDTO podhost) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.mediaType = mediaType;
        this.url = url;
        this.season = season;
        this.podhost = podhost;
    }

    // Getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GenreDTO getGenre() {
        return genre;
    }

    public void setGenre(GenreDTO genre) {
        this.genre = genre;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public MediaTypeDTO getMediaType() {
        return mediaType;
    }

    public void setMediaType(MediaTypeDTO mediaType) {
        this.mediaType = mediaType;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public SeasonDTO getSeason() {
        return season;
    }

    public void setSeason(SeasonDTO season) {
        this.season = season;
    }

    public PodhostDTO getPodhost() {
        return podhost;
    }

    public void setPodhost(PodhostDTO podhost) {
        this.podhost = podhost;
    }
}
