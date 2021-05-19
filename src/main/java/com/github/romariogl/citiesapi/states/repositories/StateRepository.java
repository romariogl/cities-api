package com.github.romariogl.citiesapi.states.repositories;

import com.github.romariogl.citiesapi.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}