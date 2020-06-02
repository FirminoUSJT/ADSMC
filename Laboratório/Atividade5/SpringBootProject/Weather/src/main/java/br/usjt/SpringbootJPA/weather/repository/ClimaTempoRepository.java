package br.usjt.SpringbootJPA.weather.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.SpringbootJPA.weather.model.Weather;

public interface ClimaTempoRepository extends JpaRepository<Weather, Long>{

	
	
}

