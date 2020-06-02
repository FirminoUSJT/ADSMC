package br.usjt.SpringbootJPA.weather.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_week")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Week implements Serializable {
	
	private static final long serialVersionUID = 7L;
	
	@Id
	@GeneratedValue
	private Long id;
	private String week;

	@OneToMany (mappedBy = "week", cascade = CascadeType.ALL)
	private List <Weather> weather;
}
