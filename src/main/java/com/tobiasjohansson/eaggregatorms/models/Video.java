package com.tobiasjohansson.eaggregatorms.models;


import jakarta.persistence.*;

@Entity
public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    @Column
    private String realeseDate;

    @Column
    private String url;

    @Column
    private String genre;

    public Video(int id, String name, String realeseDate, String url, String genre) {
        this.id = id;
        this.name = name;
        this.realeseDate = realeseDate;
        this.url = url;
        this.genre = genre;
    }

    public Video() {
    }

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

    public String getRealeseDate() {
        return realeseDate;
    }

    public void setRealeseDate(String realeseDate) {
        this.realeseDate = realeseDate;
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
