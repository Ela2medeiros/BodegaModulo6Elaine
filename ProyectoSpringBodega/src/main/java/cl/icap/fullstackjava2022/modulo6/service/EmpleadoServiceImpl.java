package cl.icap.fullstackjava2022.modulo6.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.icap.fullstackjava2022.modulo6.model.entity.Empleado;
import cl.icap.fullstackjava2022.modulo6.model.repository.EmpleadoRepository;
import cl.icap.fullstackjava2022.modulo6.service.EmpleadoService;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {
	@Autowired
	EmpleadoRepository empleadoRepository;

	public EmpleadoServiceImpl() {
		// TODO Auto-generated constructor stub
	}

  	@Override
	public Empleado get(Integer id_rut) {
		return empleadoRepository.findByIdRut(id_rut).get();
	}

	@Override
	public Empleado insert(Empleado empleado) {
		return empleadoRepository.save(empleado);
	}
	

	@Override
	public int delete(Integer idRut) {
		int vret = 0;

		try {
			empleadoRepository.delete(new Empleado(idRut, null));
			vret = 1;
		} catch (Exception e) {
			e.printStackTrace();
			vret = 0;
		}

		return vret;
	}
	
	
	@Override
	public Empleado update(Empleado empleado) {
		return empleadoRepository.save(empleado);
	}
	
	@Override
	public List<Empleado> list() {
		return empleadoRepository.findAll();
	}


	@Override
	public List<Empleado> listOrderByidRut() {
		// TODO Auto-generated method stub
		return null;
	}
 
	
}
