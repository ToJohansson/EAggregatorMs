package com.tobiasjohansson.eaggregatorms.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AggregatedData {
    private List<TrackDTO> musicTracks;
    private List<VideoDTO> videos;
    private List<EpisodeDTO> episodes;

    public AggregatedData() {
    }

    public AggregatedData(List<TrackDTO> musicTracks, List<VideoDTO> videos) {
        this.musicTracks = musicTracks;
        this.videos = videos;
    }

    public AggregatedData(List<TrackDTO> musicTracks, List<VideoDTO> videos, List<EpisodeDTO> episodes) {
        this.musicTracks = musicTracks;
        this.videos = videos;
        this.episodes = episodes;
    }

    public List<TrackDTO> getMusicTracks() {
        return musicTracks;
    }

    public void setMusicTracks(List<TrackDTO> musicTracks) {
        this.musicTracks = musicTracks;
    }

    public List<VideoDTO> getVideos() {
        return videos;
    }

    public void setVideos(List<VideoDTO> videos) {
        this.videos = videos;
    }

    public List<EpisodeDTO> getEpisodes() {
        return episodes;
    }

    public void setEpisodes(List<EpisodeDTO> episodes) {
        this.episodes = episodes;
    }
}
