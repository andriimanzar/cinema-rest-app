package com.manzar.cinemarestapp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Represents movie session.
 */
@EqualsAndHashCode(of = "id")
@Getter
@Setter
@Entity
@Table(name = "movie_sessions")
public class MovieSession {

  public MovieSession() {
  }

  /**
   * Creates MovieSession from already existing database record.
   */
  public MovieSession(Long id, Movie movie, Hall hall, LocalDateTime sessionStartTime,
      BigDecimal ticketPrice, List<Seat> seats) {
    this.id = id;
    this.movie = movie;
    this.hall = hall;
    this.sessionStartTime = sessionStartTime;
    this.ticketPrice = ticketPrice;
    this.seats = seats;
  }

  /**
   * Creates MovieSession with available seats initialization.
   */
  public MovieSession(Movie movie, Hall hall, LocalDateTime sessionStartTime,
      BigDecimal ticketPrice, List<Seat> seats) {
    this.movie = movie;
    this.hall = hall;
    this.sessionStartTime = sessionStartTime;
    this.ticketPrice = ticketPrice;
    this.seats = seats;

    for (int row = 1; row <= hall.getRowsCount(); row++) {
      for (int seatNumber = 1; seatNumber <= hall.getSeatsNumberInRow(); seatNumber++) {
        Seat seat = new Seat(row, seatNumber, false);
        seats.add(seat);
      }
    }
  }

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @OneToOne
  @JoinColumn(name = "movie_id")
  private Movie movie;
  @OneToOne
  @JoinColumn(name = "hall_id")
  private Hall hall;
  private LocalDateTime sessionStartTime;
  private BigDecimal ticketPrice;
  @Setter(AccessLevel.PRIVATE)
  @JsonIgnore
  @OneToMany(cascade = CascadeType.ALL)
  @JoinColumn(name = "movie_session_id")
  private List<Seat> seats = new ArrayList<>();

}
