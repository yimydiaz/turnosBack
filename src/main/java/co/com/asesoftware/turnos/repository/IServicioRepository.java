package co.com.asesoftware.turnos.repository;

import org.springframework.data.repository.CrudRepository;

import co.com.asesoftware.turnos.model.entity.Servicio;

public interface IServicioRepository  extends CrudRepository<Servicio, Long> {

}
