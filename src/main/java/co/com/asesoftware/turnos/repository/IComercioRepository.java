package co.com.asesoftware.turnos.repository;

import org.springframework.data.repository.CrudRepository;

import co.com.asesoftware.turnos.model.entity.Comercio;

public interface IComercioRepository extends CrudRepository<Comercio, Long> {
	
}
