package com.manzar.cinemarestapp.repository;

import com.manzar.cinemarestapp.model.MovieSession;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository for MovieSession entity.
 */
@Repository
public interface MovieSessionRepository extends JpaRepository<MovieSession, Long> {

}
