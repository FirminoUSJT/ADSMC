package br.usjt.SpringbootJPA.weather.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_city")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIdentityInfo(
		  generator = ObjectIdGenerators.PropertyGenerator.class, 
		  property = "id")
public class City {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = true, length = 10)
	private Long id;
	@Column(nullable = true, length = 100)
	private String name;
	@Column(nullable = true, length = 100)
	private double latitude;
	@Column(nullable = true, length = 100)
	private double longitude;

	@OneToMany(mappedBy = "city", cascade = CascadeType.ALL)
	private List<Weather> weather;
	@Override
	public String toString() {
		return "[id: " + id +"Name: " + nome +"Latitude: " + latitude +"Longitude: " +longitude;
	}
}
