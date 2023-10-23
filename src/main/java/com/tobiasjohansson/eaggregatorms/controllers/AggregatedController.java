package com.tobiasjohansson.eaggregatorms.controllers;

import com.tobiasjohansson.eaggregatorms.dto.AggregatedData;
import com.tobiasjohansson.eaggregatorms.models.Track;
import com.tobiasjohansson.eaggregatorms.models.Video;
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
@RequestMapping("/aggregated")
public class AggregatedController {


    private final RestTemplate restTemplate;

    public AggregatedController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/getallmedia")
    public ResponseEntity<AggregatedData> getAllMedia() {
        String musicServiceUrl = "http://localhost:7070/music/api/v1/track/getall";
        String videoServiceUrl = "http://localhost:7070/video/api/v1/getall";

        ResponseEntity<List<Track>> musicResponse = restTemplate.exchange(
                musicServiceUrl,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Track>>() {}
        );

        ResponseEntity<List<Video>> videoResponse = restTemplate.exchange(
                videoServiceUrl,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Video>>() {}
        );

        if (musicResponse.getStatusCode() == HttpStatus.OK && videoResponse.getStatusCode() == HttpStatus.OK) {
            List<Track> musicData = musicResponse.getBody();
            List<Video> videoData = videoResponse.getBody();

            AggregatedData aggregatedData = new AggregatedData(musicData, videoData);
            return ResponseEntity.ok(aggregatedData);
        } else {
            // Handle error or return an appropriate response
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

}