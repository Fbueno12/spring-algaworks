package com.algaworks.osworks.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.osworks.domain.model.Client;

@RestController
public class ClientController {
	
	@GetMapping("/clientes")
	public List<Client> listar() {
		var client1 = new Client();
		client1.setId(1L);
		client1.setName("Felipe");
		client1.setEmail("felipebueno181@gmail.com");
		client1.setPhone("11959566350");
		var client2 = new Client();
		client2.setId(1L);
		client2.setName("Nathalia");
		client2.setEmail("nathaliacristina20@hotmail.com");
		client2.setPhone("11959566350");
		
		return Arrays.asList(client1, client2);
	}
	
}
