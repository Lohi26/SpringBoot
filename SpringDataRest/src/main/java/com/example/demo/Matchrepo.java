package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="match",path="match")
public interface Matchrepo extends JpaRepository<Matchfavo,Integer>{

}
