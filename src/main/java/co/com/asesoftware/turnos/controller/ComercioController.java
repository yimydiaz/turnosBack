package co.com.asesoftware.turnos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.asesoftware.turnos.model.entity.Comercio;
import co.com.asesoftware.turnos.service.IComercioService;

@CrossOrigin(origins = { "http://localhost:3000", "http://localhost:4200" })
@RestController
@RequestMapping("api/comercios")
public class ComercioController {
	
	
	@Autowired
	private IComercioService comerService;

	@GetMapping("comercios")
	public ResponseEntity<List<Comercio>> retornoBusquedaComercio() {		
		return new ResponseEntity<>( comerService.findAll(), HttpStatus.OK) ;
	}	

	
}
