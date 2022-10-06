package co.com.asesoftware.turnos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.asesoftware.turnos.model.entity.Servicio;
import co.com.asesoftware.turnos.service.IServicioService;

@CrossOrigin(origins = { "http://localhost:3000", "http://localhost:4200" })
@RestController
@RequestMapping("api/servicios")
public class ServicioController {

	@Autowired
	private IServicioService servicioService;

	@GetMapping("servicios")
	public ResponseEntity<List<Servicio>> retornoBusquedaservicios() {
		return new ResponseEntity<>(servicioService.findAll(), HttpStatus.OK);
	}
}
