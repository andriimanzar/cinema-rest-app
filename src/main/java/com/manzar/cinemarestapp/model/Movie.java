package com.manzar.cinemarestapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.List;
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
  private String title;
  private String genre;
  private Long duration;
  private String director;
  private int releaseYear;
  private String country;
  private List<String> actors;
  private String description;
  private String posterUrl;
  private String trailerUrl;

}
