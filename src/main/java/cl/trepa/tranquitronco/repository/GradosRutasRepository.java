package cl.trepa.tranquitronco.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.trepa.tranquitronco.model.GradosRutas;

@Repository
public interface GradosRutasRepository extends JpaRepository<GradosRutas, Integer>{}
