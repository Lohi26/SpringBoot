package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface Knowledgerepo extends CrudRepository<Knowledge,Integer> {

	Knowledge getOne(int id);

}
