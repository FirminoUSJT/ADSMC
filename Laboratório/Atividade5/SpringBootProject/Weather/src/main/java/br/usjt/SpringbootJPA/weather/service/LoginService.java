package br.usjt.SpringbootJPA.weather.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.SpringbootJPA.weather.model.User;
import br.usjt.SpringbootJPA.weather.repository.UserRepo;



@Service
public class LoginService {
	
	@Autowired
	UserRepo userRepo;
	public boolean logar(User usuario) {
		
		return userRepo.findOneByLoginAndSenha(usuario.getLogin(), usuario.getSenha()) != null;
	}
}