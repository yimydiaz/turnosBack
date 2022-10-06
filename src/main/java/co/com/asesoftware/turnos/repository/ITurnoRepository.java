package co.com.asesoftware.turnos.repository;

import org.springframework.data.repository.CrudRepository;

import co.com.asesoftware.turnos.model.entity.Turno;

public interface ITurnoRepository extends CrudRepository<Turno, Long> {

}
