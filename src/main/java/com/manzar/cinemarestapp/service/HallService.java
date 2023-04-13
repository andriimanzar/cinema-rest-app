package com.manzar.cinemarestapp.service;

import com.manzar.cinemarestapp.model.Hall;
import com.manzar.cinemarestapp.repository.HallRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Provides functionality for managing cinema halls.
 */
@Service
@RequiredArgsConstructor
public class HallService {

  private final HallRepository hallRepository;

  public Hall createHall() {
    return new Hall();
  }

  public Hall editHall() {
    return new Hall();
  }

}
