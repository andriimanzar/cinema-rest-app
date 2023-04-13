package com.manzar.cinemarestapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Represents a seat in a cinema hall.
 */
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Getter
@Setter
@Entity
@Table(name = "seats")
public class Seat {

  /**
   * Constructs new Seat instance with given rowNumber, seatNumber and reservation condition.
   */
  public Seat(int rowNumber, int seatNumber, boolean isReserved) {
    this.rowNumber = rowNumber;
    this.seatNumber = seatNumber;
    this.isReserved = isReserved;
  }

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column(nullable = false)
  private int rowNumber;
  @Column(nullable = false)
  private int seatNumber;
  @Column(nullable = false)
  private boolean isReserved;
}
