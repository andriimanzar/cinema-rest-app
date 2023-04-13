package com.manzar.cinemarestapp.repository;

import com.manzar.cinemarestapp.model.Hall;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository for Hall entity.
 */
@Repository
public interface HallRepository extends JpaRepository<Hall, Long> {

}
