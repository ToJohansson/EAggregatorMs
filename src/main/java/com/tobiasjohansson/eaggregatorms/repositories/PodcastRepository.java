package com.tobiasjohansson.eaggregatorms.repositories;

import com.tobiasjohansson.eaggregatorms.models.Podcast;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PodcastRepository extends JpaRepository<Podcast, Integer> {

}
