package com.tobiasjohansson.eaggregatorms.dto;

import com.tobiasjohansson.eaggregatorms.models.Track;
import com.tobiasjohansson.eaggregatorms.models.Video;

import java.util.List;

public class AggregatedData {
    private List<Track> musicTracks;
    private List<Video> videos;

    public AggregatedData() {
    }



    public AggregatedData(List<Video> videos) {
        this.videos = videos;
    }

    public AggregatedData(List<Track> musicTracks, List<Video> videos) {
        this.musicTracks = musicTracks;
        this.videos = videos;
    }

    // Getters and setters

    public List<Track> getMusicTracks() {
        return musicTracks;
    }

    public void setMusicTracks(List<Track> musicTracks) {
        this.musicTracks = musicTracks;
    }

    public List<Video> getVideos() {
        return videos;
    }

    public void setVideos(List<Video> videos) {
        this.videos = videos;
    }
}

