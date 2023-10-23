package com.tobiasjohansson.eaggregatorms.services;

import com.tobiasjohansson.eaggregatorms.models.Podcast;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PodcastServiceInterface {

    List<Podcast> getAllPodcasts();
    Podcast updatePodcast(Podcast podcast, int ID);
    Podcast savePodcast(Podcast podcast);
    void deletePodcast(int ID);
}
