package com.example.demo.cliente;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class ClienteController {
	@GetMapping("/cliente")
	public String ExibirCliente() {
		return "cliente";
	}
	
	@PostMapping("/salvarCliente")
	public String salvarCliente(Cliente cliente) {
		System.out.println(cliente.getNomeCliente() +  " - " + cliente.getTelefoneCliente() + " - " + cliente.getEmail());
		return "index";
	}
}
