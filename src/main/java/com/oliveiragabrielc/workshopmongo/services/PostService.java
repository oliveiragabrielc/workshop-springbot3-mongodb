package com.oliveiragabrielc.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oliveiragabrielc.workshopmongo.domain.Post;
import com.oliveiragabrielc.workshopmongo.repositories.PostRepository;
import com.oliveiragabrielc.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repository;

	
	public Post findById(String id) {
		Optional<Post> post = repository.findById(id);
		return post.orElseThrow(()-> new ObjectNotFoundException(id)); 
	}
}
