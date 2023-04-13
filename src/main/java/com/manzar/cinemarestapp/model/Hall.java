package com.manzar.cinemarestapp.model;

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
 * Represents different cinema halls.
 */
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "name")
@Getter
@Setter
@Entity
@Table(name = "halls")
public class Hall {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private int capacity;

}
