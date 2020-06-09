package br.usjt.SpringbootJPA.weather.model.resource;

import java.net.URI;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import br.usjt.SpringbootJPA.weather.model.City;
import br.usjt.SpringbootJPA.weather.repository.CityRepo;

@RestController
@RequestMapping("/Citys")
public class CityResourceSettings {

	@Autowired
	private CityRepo CityRepo;

	@GetMapping("/Listing")
	@JsonIgnoreProperties
	public List<City> todasAsCitys() {
		return CityRepo.findAll();
	}

	@PostMapping("/Savesystem")
	// @ResponseStatus (HttpStatus.CREATED)
	public ResponseEntity<City> salvar(@RequestBody City City, HttpServletResponse response) {
		City c = CityRepo.save(City);
		URI uri = ServletUriComponentsBuilder.fromCurrentServletMapping().path("/{id}").buildAndExpand(c.getId())
				.toUri();

		// response.setHeader("Location", uri.toASCIIString());
		return ResponseEntity.created(uri).body(c);
	}

	@GetMapping("/{latitude}" + "/{longitude}")
	public City buscarPelaLatitudeLongitude(@PathVariable(value="latitude") String latitude, @PathVariable(value="longitude")String longitude) {
		return CityRepo.findByLatitudeAndLongitude(Double.parseDouble(latitude), Double.parseDouble(longitude));
	}
	
	@GetMapping("/{name}")
	public List findByLetterName(@PathVariable(value="name") String name){
		return CityRepo.findByNomeStartingWith(name);
	}
}
