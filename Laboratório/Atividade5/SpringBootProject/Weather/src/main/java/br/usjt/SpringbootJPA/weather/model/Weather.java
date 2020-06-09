package br.usjt.SpringbootJPA.weather.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;

@Entity
@Table(name = "tb_weather")
@Data
@AllArgsConstructor
@NoArgsConstructor 
@Getter 
@Setter
@JsonIdentityInfo(
		  generator = ObjectIdGenerators.PropertyGenerator.class, 
		  property = "id")
		  
public class Weather {

	@Id
	@GeneratedValue
	private Long id;
	@Column(nullable = false, length = 200)
	private int min;

	@Column(nullable = false, length = 30)
	private int max;

	@Column(nullable = true, length = 100)
	private double umidity;

	@Column(nullable = true, length = 100)
	private String description;

	@Temporal(TemporalType.DATE)
	@Column(nullable = true, length = 100)
	private Date date;

	@ManyToOne(cascade = CascadeType.ALL)
	private Semana week;

	@ManyToOne(cascade = CascadeType.ALL)
	private City city;

	@Override
	public String toString() {
		return "Clima [id=" + id + ", minima=" + minima + ", maxima=" + maxima + ", umidade=" + umidade + ", descricao="
				+ descricao + ", data=" + data + "]";
	}

	
	
}
