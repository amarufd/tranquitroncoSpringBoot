package cl.trepa.tranquitronco.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.trepa.tranquitronco.model.GradosRutas;
import cl.trepa.tranquitronco.repository.GradosRutasRepository;

@RestController
@RequestMapping("/api")
public class GradosRutaController {
	
	 @Autowired
	 GradosRutasRepository gradosRutasRepository;
	 
	 // Get All Notes
	 @GetMapping("/grados-rutas")
	 public List<GradosRutas> getAllNotes() {
	     return gradosRutasRepository.findAll();
	 }
	 
	// Create a new Note
	 @PostMapping("/new-grado")
	 public GradosRutas createNote(@Valid @RequestBody GradosRutas gradosRutas) {
	     return gradosRutasRepository.save(gradosRutas);
	 }



}
