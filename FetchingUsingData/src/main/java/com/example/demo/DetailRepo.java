package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface DetailRepo extends CrudRepository<Details,Integer> {
	@Query(value="select * from details order by name",nativeQuery=true)
	List<Details> findByNameOrder(String name);
	List<Details> findByIdGreaterThanEqual(int id);
	List<Details> findByName(String name);
	@Query(value="select * from details",nativeQuery=true)
	List<Details> findByDisplayAll(int id);
}