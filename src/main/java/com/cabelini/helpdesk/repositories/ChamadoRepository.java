package com.cabelini.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cabelini.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

}
