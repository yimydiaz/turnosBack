package co.com.asesoftware.turnos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.asesoftware.turnos.model.entity.Servicio;
import co.com.asesoftware.turnos.repository.IServicioRepository;

@Service
public class ServicioServiceImpl implements IServicioService{
	
	@Autowired
	private IServicioRepository servicioRepository;

	@Override
	public List<Servicio> findAll() {
		
		return (List<Servicio>) servicioRepository.findAll();
	}

}
