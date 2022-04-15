package cl.icap.fullstackjava2022.modulo6.service;

import java.util.List;

import cl.icap.fullstackjava2022.modulo6.model.entity.Empleado;


public interface EmpleadoService{
	public Empleado get(Integer idRut);
	public Empleado insert(Empleado empleado);
	public Empleado update(Empleado empleado);
	public List<Empleado> list();
	public List<Empleado> listOrderByidRut();
	public int delete(Integer idRut);
	
}