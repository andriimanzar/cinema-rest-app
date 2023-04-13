package com.manzar.cinemarestapp.repository;

import com.manzar.cinemarestapp.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository for Ticket entity.
 */
@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {

}
