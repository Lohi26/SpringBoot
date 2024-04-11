package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface Voterepo extends CrudRepository<Vote,Integer> {

	Vote getOne(int id);

}
