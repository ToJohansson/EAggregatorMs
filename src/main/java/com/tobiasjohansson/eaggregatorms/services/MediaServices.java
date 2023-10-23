package com.tobiasjohansson.eaggregatorms.services;

import com.tobiasjohansson.eaggregatorms.models.MediaType;
import com.tobiasjohansson.eaggregatorms.models.Track;
import com.tobiasjohansson.eaggregatorms.models.Video;
import com.tobiasjohansson.eaggregatorms.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Service
public class MediaServices {

    @Autowired
    private TrackRepository trackRepository;
    @Autowired
    private VideoRepository videoRepository;
    @Autowired
    private ArtistRepository artistRepository;

    @Autowired
    private MediaTypeRepository mediaTypeRepository;
    @Autowired
    private PodhostRepository podhostRepository;


    @Autowired
    private GenreRepository genreRepository;






    public MediaServices(TrackRepository trackRepository, VideoRepository videoRepository) {
        this.trackRepository = trackRepository;
        this.videoRepository = videoRepository;
    }

    public TrackRepository getTrackRepository() {
        return trackRepository;
    }

    public void setTrackRepository(TrackRepository trackRepository) {
        this.trackRepository = trackRepository;
    }

    public VideoRepository getVideoRepository() {
        return videoRepository;
    }

    public void setVideoRepository(VideoRepository videoRepository) {
        this.videoRepository = videoRepository;
    }
}
