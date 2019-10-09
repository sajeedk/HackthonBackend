package com.hackathon.test.hackthontest.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackathon.test.hackthontest.dao.MainDao;
import com.hackathon.test.hackthontest.pojo.Container;

@Service
public class MainService {
	
	
@Autowired	
MainDao dao;

public Optional<Container> findById(String id)
{
	
	return   dao.findById(id);
}

public Container saveItem(Container container) {
	
	return dao.save(container);
	
	// TODO Auto-generated method stub

}
	
}
