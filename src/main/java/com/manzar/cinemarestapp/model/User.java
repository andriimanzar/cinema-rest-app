package com.manzar.cinemarestapp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.ArrayList;
import java.util.List;
import lombok.AccessLevel;
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
  @Enumerated(EnumType.STRING)
  private UserRole userRole;
  @JsonIgnore
  @OneToMany(mappedBy = "user")
  @Setter(AccessLevel.PRIVATE)
  private List<Ticket> tickets = new ArrayList<>();

  public void addTicket(Ticket ticket) {
    tickets.add(ticket);
    ticket.setUser(this);
  }

  public void removeTicket(Ticket ticket) {
    tickets.remove(ticket);
    ticket.setUser(null);
  }
}
