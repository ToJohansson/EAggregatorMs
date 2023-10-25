package com.tobiasjohansson.eaggregatorms.dto;


public class TrackDTO {
    private int id;
    private String name;
    private GenreDTO genre;
    private String releaseDate;
    private MediaTypeDTO mediaType;
    private String url;
    private ArtistDTO artist;
    private AlbumDTO album;

    public TrackDTO() {
    }

    public TrackDTO(int id, String name, GenreDTO genre, String releaseDate, MediaTypeDTO mediaType, String url, ArtistDTO artist, AlbumDTO album) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.mediaType = mediaType;
        this.url = url;
        this.artist = artist;
        this.album = album;
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

    public ArtistDTO getArtist() {
        return artist;
    }

    public void setArtist(ArtistDTO artist) {
        this.artist = artist;
    }

    public AlbumDTO getAlbum() {
        return album;
    }

    public void setAlbum(AlbumDTO album) {
        this.album = album;
    }
}
