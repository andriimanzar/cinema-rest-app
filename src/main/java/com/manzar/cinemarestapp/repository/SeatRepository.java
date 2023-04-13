package com.manzar.cinemarestapp.repository;

import com.manzar.cinemarestapp.model.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository for Seat entity.
 */
@Repository
public interface SeatRepository extends JpaRepository<Seat, Long> {

}
