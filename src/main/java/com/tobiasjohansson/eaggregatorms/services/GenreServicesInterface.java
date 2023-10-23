package com.tobiasjohansson.eaggregatorms.services;

import com.tobiasjohansson.eaggregatorms.models.Genre;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GenreServicesInterface {

    Genre saveGenre(Genre genre);

    List<Genre> getAllGenres();

    Genre updateGenre(Genre genre, int id);

    void deleteGenre(int id);

    List<Genre> findByGenre(String genre);

}
