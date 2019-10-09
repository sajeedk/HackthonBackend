package com.hackathon.test.hackthontest.dao;

import org.springframework.stereotype.Repository;

import com.hackathon.test.hackthontest.pojo.Container;
import com.microsoft.azure.spring.data.cosmosdb.repository.DocumentDbRepository;

@Repository
public interface MainDao  extends DocumentDbRepository<Container, String> {

	
	//Container findById(int id);

	 
	 
}
