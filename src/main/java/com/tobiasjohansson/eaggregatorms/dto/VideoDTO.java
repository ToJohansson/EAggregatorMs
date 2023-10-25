package com.tobiasjohansson.eaggregatorms.dto;

public class VideoDTO {
    private int id;
    private String name;
    private String releaseDate;
    private String url;
    private String genre;

    public VideoDTO() {
    }

    public VideoDTO(int id, String name, String releaseDate, String url, String genre) {
        this.id = id;
        this.name = name;
        this.releaseDate = releaseDate;
        this.url = url;
        this.genre = genre;
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

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
