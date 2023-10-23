package com.tobiasjohansson.eaggregatorms.services;

import com.tobiasjohansson.eaggregatorms.models.Album;

import java.util.List;

public interface AlbumInterface {

    Album getAlbumByTitle(String albumTitle);

    List<Album> findAlbumsByArtistName(String artistName);

     Album findAlbumByTrackName(String trackName);

     Album updateAlbum(Album album, int id);
}


