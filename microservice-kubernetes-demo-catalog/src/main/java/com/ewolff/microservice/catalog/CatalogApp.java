package com.ewolff.microservice.catalog;

import javax.annotation.PostConstruct;
// This is a test 
//tag change one by nic 
// tag change two by nic
// tag change THREE by nic
// tag chnage FOUR by nic
// tag change FIVE by nick
// tag change SIX by nick
//tag change seven by nick
//tag change eight by nic
//tag chnage nine by Nick
//tag chnage ten on march 3rd by nick
//tag change 11 on march 23 by Nick
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@ComponentScan
@EnableAutoConfiguration
@Component
public class CatalogApp {

	private final ItemRepository itemRepository;

	@Autowired
	public CatalogApp(ItemRepository itemRepository) {
		this.itemRepository = itemRepository;
	}

	@PostConstruct
	public void generateTestData() {
		itemRepository.save(new Item("iPod", 42.0));
		itemRepository.save(new Item("iPod touch", 21.0));
		itemRepository.save(new Item("iPod nano", 1.0));
		itemRepository.save(new Item("Apple TV", 100.0));
	}

	public static void main(String[] args) {
		SpringApplication.run(CatalogApp.class, args);
	}

}
