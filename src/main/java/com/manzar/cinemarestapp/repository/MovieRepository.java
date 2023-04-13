package com.manzar.cinemarestapp.repository;

import com.manzar.cinemarestapp.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository for Movie entity.
 */
@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

}
