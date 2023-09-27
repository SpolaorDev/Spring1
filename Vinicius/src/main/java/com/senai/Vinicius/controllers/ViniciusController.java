package com.senai.Vinicius.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.Vinicius.entities.Cliente;
import com.senai.Vinicius.services.ViniciusService;

@RestController
@RequestMapping("/cliente")
public class ViniciusController{
	private final ViniciusService viniciusService;

	@Autowired
	public ViniciusController(ViniciusService viniciusService) {
		this.viniciusService = viniciusService;
	}

	@PostMapping
	public Cliente createCliente(@RequestBody Cliente cliente) {
		return viniciusService.saveCliente(cliente);
	}

	@GetMapping
	public List<Cliente> getAllCliente() {
		return viniciusService.getAllCliente();
	}

	@GetMapping("/{id}")
	public Cliente getCliente(@PathVariable Long id) {
		return viniciusService.getClienteById(id);
	}

	@DeleteMapping("/{id}")
	public void deleteCliente(Long id) {
		viniciusService.deleteCliente(id);
	}

}
