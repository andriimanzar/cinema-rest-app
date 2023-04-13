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
 * Represents movie.
 */
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "title")
@Getter
@Setter
@Entity
@Table(name = "movies")
public class Movie {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column(nullable = false)
  private String title;
  @Column(nullable = false)
  private String genre;
  @Column(nullable = false)
  private Long duration;
  @Column(nullable = false)
  private String director;
  @Column(nullable = false)
  private int releaseYear;
  private String country;
  @Column(nullable = false)
  private String description;
  private String posterUrl;
  private String trailerUrl;

}
