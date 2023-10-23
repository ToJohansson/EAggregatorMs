package com.tobiasjohansson.eaggregatorms.services;


import com.tobiasjohansson.eaggregatorms.models.Video;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VideoServiceInterface {

    List<Video> getAllVideos();

    Video getVideo (int id);

    Video addVideo(Video video);

    void removeVideo(int id);

    Video getVideoByName(String videoName);

//    List<Video> getVideoByGenre(String genreName);
}

