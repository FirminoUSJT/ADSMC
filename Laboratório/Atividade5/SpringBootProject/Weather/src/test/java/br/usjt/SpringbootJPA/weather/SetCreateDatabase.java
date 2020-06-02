package br.usjt.SpringbootJPA.weather;

import javax.persistence.Persistence;

public class SetCreateDatabase {
	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("usjtAtiv");
	}
}
