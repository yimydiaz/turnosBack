package co.com.asesoftware.turnos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.asesoftware.turnos.model.entity.Comercio;
import co.com.asesoftware.turnos.model.entity.Countries;
import co.com.asesoftware.turnos.repository.IComercioRepository;
import co.com.asesoftware.turnos.repository.ITurnoRepository;

@Service
public class ComercioServiceImpl implements IComercioService{
	
	@Autowired
	private IComercioRepository comercioRepository;

	@Override
	public List<Comercio> findAll() {
		
		return (List<Comercio>) comercioRepository.findAll();
	}

}
