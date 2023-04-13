package com.manzar.cinemarestapp.service;

import com.manzar.cinemarestapp.model.Movie;
import com.manzar.cinemarestapp.repository.MovieRepository;
import java.util.Collections;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Provides functionality for managing movies.
 */
@Service
@RequiredArgsConstructor
public class MovieService {

  private final MovieRepository movieRepository;

  public List<Movie> getAvailableMovies() {
    return Collections.emptyList();
  }

  public Movie addMovie() {
    return new Movie();
  }

  public Movie editMovie() {
    return new Movie();
  }

  public boolean deleteMovie() {
    return true;
  }
}
