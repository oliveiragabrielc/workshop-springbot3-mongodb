package com.oliveiragabrielc.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oliveiragabrielc.workshopmongo.domain.User;
import com.oliveiragabrielc.workshopmongo.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
}
