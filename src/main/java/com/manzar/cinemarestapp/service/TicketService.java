package com.manzar.cinemarestapp.service;

import com.manzar.cinemarestapp.model.Ticket;
import com.manzar.cinemarestapp.repository.TicketRepository;
import java.util.Collections;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Provides functionality for managing tickets.
 */
@Service
@RequiredArgsConstructor
public class TicketService {

  private final TicketRepository ticketRepository;

  public List<Ticket> reserveTickets() {
    return Collections.emptyList();
  }


}
