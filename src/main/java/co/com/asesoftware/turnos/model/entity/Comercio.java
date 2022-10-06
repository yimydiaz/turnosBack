package co.com.asesoftware.turnos.model.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "comercios", schema = "HR")
public class Comercio implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id_comercio")
	private String id;

	@Column(name = "nom_comercio")
	private String nomComercio;

	@Column(name = "aforo_maximo")
	private Long aforoMaximo;

	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@OneToMany(mappedBy = "comercio", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<Servicio> servicios;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNomComercio() {
		return nomComercio;
	}

	public void setNomComercio(String nomComercio) {
		this.nomComercio = nomComercio;
	}

	public Long getAforoMaximo() {
		return aforoMaximo;
	}

	public void setAforoMaximo(Long aforoMaximo) {
		this.aforoMaximo = aforoMaximo;
	}

	public Set<Servicio> getServicios() {
		return servicios;
	}

	public void setServicios(Set<Servicio> servicios) {
		this.servicios = servicios;
	}

}
