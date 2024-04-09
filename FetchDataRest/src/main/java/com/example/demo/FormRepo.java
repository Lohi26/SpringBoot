package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface FormRepo extends CrudRepository<Formdetails,Integer>{
	@Query(value="Select * from formdetails",nativeQuery=true)
	List<Formdetails> findByNameAll(String name);
}
