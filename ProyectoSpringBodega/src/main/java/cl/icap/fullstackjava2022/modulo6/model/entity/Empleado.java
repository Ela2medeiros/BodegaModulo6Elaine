package cl.icap.fullstackjava2022.modulo6.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Empleado {
	
	@Column(name = "id_rut")
	@Id
	private Integer idRut;
	@Column
	private String nombre;
	
	
	public Empleado() {
	}


	public Empleado(Integer idRut, String nombre) {
		this.idRut = idRut;
		this.nombre = nombre;
	}

	public Integer getId_rut() {
		return idRut;
	}

	public void setId_rut(Integer idRut) {
		this.idRut = idRut;
	}

	public String get_nombre() {
		return nombre;
	}

	public void set_nombre(String nombre) {
		this.nombre = nombre;
	}

}