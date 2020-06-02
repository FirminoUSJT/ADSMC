package br.usjt.SpringbootJPA.weather;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.usjt.SpringbootJPA.weather.model.City;
import br.usjt.SpringbootJPA.weather.model.Weather;
import br.usjt.SpringbootJPA.weather.model.Week;
import br.usjt.SpringbootJPA.weather.repository.JPAUtil;

public class DailyWeather {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Week w = new Week();
		s.setSemana("Friday");
		manager.persist(w);
		City ci = new City();
		ci.setNome("Alberta");
		ci.setLatitude(56.1304);
		ci.setLongitude(106.3468);
		manager.persist(ci);
		Weather we = new Weather();
		manager.persist(we);
		transaction.commit();
		manager.close();
		JPAUtil.close();
	}
}