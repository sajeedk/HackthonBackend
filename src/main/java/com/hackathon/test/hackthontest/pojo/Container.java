package com.hackathon.test.hackthontest.pojo;

import org.springframework.data.annotation.Id;


import com.microsoft.azure.spring.data.cosmosdb.core.mapping.Document;
import com.microsoft.azure.spring.data.cosmosdb.core.mapping.PartitionKey;

@Document(collection="container1")
public class Container {
	
	private String name;
	
	@PartitionKey
	private String id;
	private String credits;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

	
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCredits() {
		return credits;
	}
	public void setCredits(String credits) {
		this.credits = credits;
	}
	@Override
	public String toString() {
		return "Container [name=" + name + ", id=" + id + ", credits=" + credits + "]";
	}
	
	
	
	
	
	

}
