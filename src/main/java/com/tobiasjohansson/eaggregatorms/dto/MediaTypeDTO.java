package com.tobiasjohansson.eaggregatorms.dto;

import java.util.List;

public class MediaTypeDTO {
    private int id;
    private String type;
    private List<GenreDTO> genres;

    public MediaTypeDTO() {
    }

    public MediaTypeDTO(int id, String type, List<GenreDTO> genres) {
        this.id = id;
        this.type = type;
        this.genres = genres;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<GenreDTO> getGenres() {
        return genres;
    }

    public void setGenres(List<GenreDTO> genres) {
        this.genres = genres;
    }
}
