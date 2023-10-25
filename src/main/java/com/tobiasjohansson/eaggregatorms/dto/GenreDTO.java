package com.tobiasjohansson.eaggregatorms.dto;

import java.util.List;

public class GenreDTO {
    private int id;
    private String genreName;
    private List<MediaTypeDTO> mediaTypes;

    public GenreDTO() {
    }

    public GenreDTO(int id, String genreName, List<MediaTypeDTO> mediaTypes) {
        this.id = id;
        this.genreName = genreName;
        this.mediaTypes = mediaTypes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGenreName() {
        return genreName;
    }

    public void setGenreName(String genreName) {
        this.genreName = genreName;
    }

    public List<MediaTypeDTO> getMediaTypes() {
        return mediaTypes;
    }

    public void setMediaTypes(List<MediaTypeDTO> mediaTypes) {
        this.mediaTypes = mediaTypes;
    }
}
