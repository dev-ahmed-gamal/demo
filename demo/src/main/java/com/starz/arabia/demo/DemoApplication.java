package com.starz.arabia.demo;

import java.io.IOException;
import java.io.InputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.starz.arabia.demo.data.DataCollection;
import com.starz.arabia.demo.model.Entries;
import com.starz.arabia.demo.model.Filters;
import com.starz.arabia.demo.model.Filter;

@SpringBootApplication
@EnableConfigurationProperties
public class DemoApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);

	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner run() throws Exception {
		return args -> {
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<Entries> typeReference = new TypeReference<Entries>(){};
			InputStream inputStream = TypeReference.class.getResourceAsStream("/entries.json");
			TypeReference<Filters> filtersReference = new TypeReference<Filters>(){};
			InputStream filtersInputStream = TypeReference.class.getResourceAsStream("/filters.json");
			try {
				Entries entries	 = mapper.readValue(inputStream,typeReference);
				DataCollection.entries = entries.getEntriesMovies();
				logger.info("entries: " + DataCollection.entries.size());
			} catch (IOException e){
				e.printStackTrace();
			}
			try {
				Filters filters	 = mapper.readValue(filtersInputStream,filtersReference);
				DataCollection.filters = filters.getFilters();
				for (Filter filter : DataCollection.filters) {
					DataCollection.filtersMap.put(filter.getFilter(), filter);
				}
				logger.info("filters size: " + DataCollection.filters.size());
			} catch (IOException e){
				e.printStackTrace();
			}
		};
	}

}
