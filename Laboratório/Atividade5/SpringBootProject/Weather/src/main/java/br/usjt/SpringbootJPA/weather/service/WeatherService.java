package br.usjt.SpringbootJPA.weather.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.SpringbootJPA.weather.model.Clima;
import br.usjt.SpringbootJPA.weather.model.Weather;
import br.usjt.SpringbootJPA.weather.repository.ClimaTempoRepository;


@Service
public class WeatherService {


	@Autowired
	private Weather climaTempoRepo;

	public List<Weather> listarTodos() {
		List <Weather> periodos = climaTempoRepo.findAll();
		return periodos;
	}
}
