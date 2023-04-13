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
 * Represents logged-in user.
 */
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Getter
@Setter
@Entity
@Table(name = "users")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String firstName;
  private String lastName;
  private String email;
  private String phoneNumber;
  private UserRole userRole;
  private List<Ticket> ticketsInCart;
  private List<Ticket> previousTickets;
}
