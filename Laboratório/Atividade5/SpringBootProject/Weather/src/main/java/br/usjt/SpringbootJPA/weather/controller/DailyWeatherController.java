package br.usjt.SpringbootJPA.weather.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.SpringbootJPA.weather.model.Clima;
import br.usjt.SpringbootJPA.weather.service.ClimaTempoService;


@Controller
public class DailyWeatherController {
	
	@Autowired
	private WeatherService WeatherService;
	
	@GetMapping("/previsao")
	public ModelAndView listarClima() {
		ModelAndView mv = new ModelAndView("lista_periodos");
		mv.addObject(new Clima());
		List<Clima> clima = WeatherService.listarTodos(); // traz todos FindAll
		mv.addObject("clima", clima);
		return mv;
	}
	
}

