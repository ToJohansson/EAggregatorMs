package com.tobiasjohansson.eaggregatorms.services;

import com.tobiasjohansson.eaggregatorms.models.Track;

import java.util.List;

public interface TrackInterface {

    Track getTrackByName(String trackName);

    Track updateTracks(Track track, int id);

    List<Track> getTrackByArtist(String artistName);
}
