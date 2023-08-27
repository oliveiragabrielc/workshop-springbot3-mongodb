package com.oliveiragabrielc.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oliveiragabrielc.workshopmongo.domain.User;
import com.oliveiragabrielc.workshopmongo.repositories.UserRepository;
import com.oliveiragabrielc.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(String id) {
		Optional<User> user = repository.findById(id);
		return user.orElseThrow(()-> new ObjectNotFoundException(id));
	}
	
	public User insert(User user) {
		repository.save(user);
		return findById(user.getId());
	}
	
	public void delete(String id) {
		repository.deleteById(id);
	}
	
	public User update(String id, User user) {
		User userNotUpdate = findById(id);
		userNotUpdate.setName(user.getName());
		userNotUpdate.setEmail(user.getEmail());
		repository.save(userNotUpdate);
		return findById(id);
	}
}
