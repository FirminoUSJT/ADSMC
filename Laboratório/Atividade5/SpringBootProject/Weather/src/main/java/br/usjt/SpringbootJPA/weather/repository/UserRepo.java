package br.usjt.SpringbootJPA.weather.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.SpringbootJPA.weather.model.User;


public interface UserRepo extends JpaRepository<User Long>{
	public User findOneByLoginAndSenha(String login, String senha);
	
}
