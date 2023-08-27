package com.oliveiragabrielc.workshopmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.oliveiragabrielc.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String> {

}
