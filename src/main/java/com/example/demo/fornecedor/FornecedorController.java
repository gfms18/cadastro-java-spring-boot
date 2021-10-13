package com.example.demo.fornecedor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FornecedorController {
	@GetMapping("/fornecedor")
	public String ExibirFornecedor() {
		return "fornecedor";
	}
	
	@PostMapping("/salvar")
	public String salvar(Fornecedor fornecedor) {
		System.out.println(fornecedor.getNome() +  " - " + fornecedor.getCnpj() + " - " + fornecedor.getTelefone());
		return "index";
	}
}


