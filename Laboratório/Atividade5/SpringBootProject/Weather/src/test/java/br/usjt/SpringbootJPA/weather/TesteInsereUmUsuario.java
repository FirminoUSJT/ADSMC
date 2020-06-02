package br.usjt.SpringbootJPA.weather;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.usjt.SpringbootJPA.weather.model.User;
import br.usjt.SpringbootJPA.weather.repository.JPAUtil;

public class TesteInsereUmUsuario {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		User u = new User(null, "Firmino", "0567632");
		manager.persist(u);
		transaction.commit();
		manager.close();
		JPAUtil.close();
	}

}
