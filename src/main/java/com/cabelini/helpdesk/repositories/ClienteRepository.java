package com.cabelini.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cabelini.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
