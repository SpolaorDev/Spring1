package com.senai.Vinicius.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.Vinicius.entities.Cliente;
import com.senai.Vinicius.repositories.ViniciusRepository;

@Service
public class ViniciusService {

	private final ViniciusRepository viniciusRepository;

	@Autowired
	public ViniciusService(ViniciusRepository viniciusRepository) {
		this.viniciusRepository = viniciusRepository;
	}

	// inserir produtos
	public Cliente saveCliente(Cliente cliente) {
		return viniciusRepository.save(cliente);
	}

	// listar produtos por id
	public Cliente getClienteById(Long id) {
		return viniciusRepository.findById(id).orElse(null);
	}

	// listar todos os produtos
	public List<Cliente> getAllCliente() {
		return viniciusRepository.findAll();

	}

	// apagar produto
	public void deleteCliente(Long Id) {
		viniciusRepository.deleteById(Id);
	}

}
