package com.tobiasjohansson.eaggregatorms.repositories;

import com.tobiasjohansson.eaggregatorms.models.MediaType;
import com.tobiasjohansson.eaggregatorms.models.Podhost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PodhostRepository extends JpaRepository<Podhost, Integer> {

}


