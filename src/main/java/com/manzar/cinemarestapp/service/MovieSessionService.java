package com.manzar.cinemarestapp.service;

import com.manzar.cinemarestapp.model.Movie;
import com.manzar.cinemarestapp.model.MovieSession;
import com.manzar.cinemarestapp.repository.MovieSessionRepository;
import java.util.Collections;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Provides functionality for managing movie sessions.
 */
@Service
@RequiredArgsConstructor
public class MovieSessionService {

  private final MovieSessionRepository movieSessionRepository;

  public List<MovieSession> showSessionsByMovie(Movie movie) {
    return Collections.emptyList();
  }

  public MovieSession createSession() {
    return new MovieSession();
  }

  public MovieSession editSession() {
    return new MovieSession();
  }

  public boolean deleteSession() {
    return true;
  }

}
