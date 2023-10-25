package com.tobiasjohansson.eaggregatorms.dto;

public class ArtistDTO {
    private int id;
    private String name;
    private GenreDTO genre;
    private MediaTypeDTO mediaType;

    public ArtistDTO() {
    }

    public ArtistDTO(int id, String name, GenreDTO genre, MediaTypeDTO mediaType) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.mediaType = mediaType;
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

    public GenreDTO getGenre() {
        return genre;
    }

    public void setGenre(GenreDTO genre) {
        this.genre = genre;
    }

    public MediaTypeDTO getMediaType() {
        return mediaType;
    }

    public void setMediaType(MediaTypeDTO mediaType) {
        this.mediaType = mediaType;
    }
}
