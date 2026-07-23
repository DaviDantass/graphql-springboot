package com.davidantasdev.graphql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraphqlApplication {
	/**
	 * GraphQL is a query language and runtime for APIs created by Facebook.
	 * It allows clients to request exactly the specific data they need,
	 * eliminating over-fetching or under-fetching payloads.
	 * This yields a highly flexible architecture where a single endpoint handles complex, deeply nested data needs.
	 * **/
	public static void main(String[] args) {
		SpringApplication.run(GraphqlApplication.class, args);
	}

}
