package com.github.romariogl.citiesapi.countries.repositories;

import com.github.romariogl.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
