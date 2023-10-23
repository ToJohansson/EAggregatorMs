package com.tobiasjohansson.eaggregatorms.repositories;

import com.tobiasjohansson.eaggregatorms.models.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Integer> {

    /*@Query("SELECT s FROM Genre s WHERE s.genreName =:genre")*/
    List<Genre> findByGenreNameContainingIgnoreCase(@Param("genre") String genre);
    Genre findByGenreNameContainingIgnoreCaseOrderById(@Param("genreName") String genreName);

}
