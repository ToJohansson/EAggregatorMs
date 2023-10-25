package com.tobiasjohansson.eaggregatorms.controllers;

import com.tobiasjohansson.eaggregatorms.controllers.*;
import com.tobiasjohansson.eaggregatorms.dto.AggregatedData;
import com.tobiasjohansson.eaggregatorms.dto.EpisodeDTO;
import com.tobiasjohansson.eaggregatorms.dto.TrackDTO;
import com.tobiasjohansson.eaggregatorms.dto.VideoDTO;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/api/v1/aggregated")
public class AggregatedController {
    private final RestTemplate restTemplate;

    public AggregatedController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/getallmedia")
    public ResponseEntity<AggregatedData> getAllMedia() {
        String musicServiceUrl = "http://localhost:1010/api/v1/music/track/getall";
        String videoServiceUrl = "http://localhost:1010/api/v1/video/getall";
        String episodeServiceUrl = "http://localhost:1010/api/v1/podcast/episodes/getall";


        ResponseEntity<List<TrackDTO>> musicResponse = restTemplate.exchange(
                musicServiceUrl,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<TrackDTO>>() {}
        );

        ResponseEntity<List<VideoDTO>> videoResponse = restTemplate.exchange(
                videoServiceUrl,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<VideoDTO>>() {}
        );

        ResponseEntity<List<EpisodeDTO>> episodeResponse = restTemplate.exchange(
                episodeServiceUrl,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<EpisodeDTO>>() {}
        );

        if (musicResponse.getStatusCode() == HttpStatus.OK && videoResponse.getStatusCode() == HttpStatus.OK
                && episodeResponse.getStatusCode() == HttpStatus.OK) {
            List<TrackDTO> musicData = musicResponse.getBody();
            List<VideoDTO> videoData = videoResponse.getBody();
            List<EpisodeDTO> episodeData = episodeResponse.getBody();

            AggregatedData aggregatedData = new AggregatedData();
            aggregatedData.setMusicTracks(musicData);
            aggregatedData.setVideos(videoData);
            aggregatedData.setEpisodes(episodeData);

            return ResponseEntity.ok(aggregatedData);
        } else {
            // Handle error or return an appropriate response
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
