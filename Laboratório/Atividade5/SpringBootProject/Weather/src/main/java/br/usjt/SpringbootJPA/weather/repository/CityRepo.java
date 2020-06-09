package br.usjt.SpringbootJPA.weather.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import br.usjt.SpringbootJPA.weather.model.City;

public interface CityRepo extends JpaRepository <City, Long>{
	
	City findByLatitudeAndLongitude(double latitude, double longitude);
	
	
    List<City> findByNomeStartingWith(String name);
	
	
}
