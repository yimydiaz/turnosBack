package co.com.asesoftware.turnos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.asesoftware.turnos.model.entity.Turno;
import co.com.asesoftware.turnos.repository.ITurnoRepository;

@Service
public class TurnoServiceImpl implements ITurnoService{
	
	@Autowired
	private ITurnoRepository turnoRepository;

	@Override
	public List<Turno> findAll() {
		
		return (List<Turno>) turnoRepository.findAll();
	}

}
