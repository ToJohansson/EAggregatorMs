package com.tobiasjohansson.eaggregatorms.services;

import com.tobiasjohansson.eaggregatorms.models.Video;
import com.tobiasjohansson.eaggregatorms.repositories.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoService implements VideoServiceInterface {

    @Autowired
    private VideoRepository videoRepository;

    //Get all videos
    @Override
    public List<Video> getAllVideos() {
        return videoRepository.findAll();
    }

    //Get a video
    @Override
    public Video getVideo(int id) {
        return videoRepository.findById(id);
    }

    //Add a video
    @Override
    public Video addVideo(Video video) {
        return videoRepository.save(video);
    }

    //Remove a video
    @Override
    public void removeVideo(int id) {
        videoRepository.deleteById(id);

    }

    @Override
    public Video getVideoByName(String videoName) {
        return videoRepository.findVideoByNameContainingIgnoreCase(videoName);
    }

//    @Override
//    public List<Video> getVideoByGenre(String genreName) {
//        return videoRepository.findVideoByGenreContainingIgnoreCase(genreName);
//    }
}