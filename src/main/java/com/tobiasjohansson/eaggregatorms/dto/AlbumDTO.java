package com.tobiasjohansson.eaggregatorms.dto;

import java.util.List;

public class AlbumDTO {
    private int id;
    private String title;
    private String releaseDate;
    private List<TrackDTO> trackList;
    private ArtistDTO artist;

    public AlbumDTO() {
    }

    public AlbumDTO(int id, String title, String releaseDate, List<TrackDTO> trackList, ArtistDTO artist) {
        this.id = id;
        this.title = title;
        this.releaseDate = releaseDate;
        this.trackList = trackList;
        this.artist = artist;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public List<TrackDTO> getTrackList() {
        return trackList;
    }

    public void setTrackList(List<TrackDTO> trackList) {
        this.trackList = trackList;
    }

    public ArtistDTO getArtist() {
        return artist;
    }

    public void setArtist(ArtistDTO artist) {
        this.artist = artist;
    }
}
