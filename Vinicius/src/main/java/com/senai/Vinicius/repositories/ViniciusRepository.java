package com.senai.Vinicius.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.Vinicius.entities.Cliente;

public interface ViniciusRepository extends JpaRepository<Cliente, Long>{

}
