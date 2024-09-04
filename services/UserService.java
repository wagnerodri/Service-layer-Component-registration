package com.projeto1.projeto1.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto1.projeto1.entities.User;
import com.projeto1.projeto1.repositories.UserRepository;

/* implemetar operaçoes para buscar todo USUARIOS é buscar por ID */
@Service
public class UserService {
	
	
	@Autowired
	private UserRepository repository;
	/* metodo para retorna todos usuarios do banco de dados */
	public List<User> findAll(){
		return repository.findAll();
	}
	/* Buscando por ID */
	
	public User findById(Long id) {
		Optional <User> obj = repository.findById(id);
		return obj.get();
	}

}

