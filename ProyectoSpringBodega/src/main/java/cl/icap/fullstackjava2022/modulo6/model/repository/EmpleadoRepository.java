package cl.icap.fullstackjava2022.modulo6.model.repository;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import cl.icap.fullstackjava2022.modulo6.model.entity.Empleado;


@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, String> {

    Optional<Empleado> findByIdRut(Integer idRut);
    
 /*  List <EmpleadoRepository> findAllByOrderById_rut(); */

}
