package com.GftFood.demo.client;

import org.springframework.web.client.RestTemplate;

import com.GftFood.demo.client.api.RestauranteClient;

public class ListagemRestaurantesMain {

	public static void main(String[] args) {
		RestTemplate restTemplate = new RestTemplate();
		
		RestauranteClient restauranteClient = new RestauranteClient(
				restTemplate, "http://localhost:8080");
		
		restauranteClient.listar().stream()
		.forEach(restaurante -> System.out.println(restaurante));
	}
}
