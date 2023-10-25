package com.tobiasjohansson.eaggregatorms.dto;

import java.util.List;

public class SeasonDTO {
    private int id;
    private String title;
    private String releaseDate;
    private List<EpisodeDTO> episodeList;
    private PodhostDTO podhost;

    public SeasonDTO() {
    }

    public SeasonDTO(int id, String title, String releaseDate, List<EpisodeDTO> episodeList, PodhostDTO podhost) {
        this.id = id;
        this.title = title;
        this.releaseDate = releaseDate;
        this.episodeList = episodeList;
        this.podhost = podhost;
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

    public List<EpisodeDTO> getEpisodeList() {
        return episodeList;
    }

    public void setEpisodeList(List<EpisodeDTO> episodeList) {
        this.episodeList = episodeList;
    }

    public PodhostDTO getPodhost() {
        return podhost;
    }

    public void setPodhost(PodhostDTO podhost) {
        this.podhost = podhost;
    }
}

