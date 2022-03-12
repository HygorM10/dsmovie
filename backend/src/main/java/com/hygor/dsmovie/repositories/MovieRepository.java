package com.hygor.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hygor.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
