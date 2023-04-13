package com.manzar.cinemarestapp.service;

import com.manzar.cinemarestapp.model.Ticket;
import com.manzar.cinemarestapp.model.User;
import com.manzar.cinemarestapp.repository.UserRepository;
import java.util.Collections;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Provides functionality for managing users.
 */
@Service
@RequiredArgsConstructor
public class UserService {

  private final UserRepository userRepository;

  public User editUser() {
    return new User();
  }

  public List<Ticket> getAllUserPreviousTickets() {
    return Collections.emptyList();
  }

  public List<Ticket> getAllUserTicketsInCart() {
    return Collections.emptyList();
  }
}
