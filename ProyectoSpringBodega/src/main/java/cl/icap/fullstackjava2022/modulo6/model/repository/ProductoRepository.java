package cl.icap.fullstackjava2022.modulo6.model.repository;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import cl.icap.fullstackjava2022.modulo6.model.entity.Producto;


@Repository
public interface ProductoRepository extends JpaRepository<Producto, String> {
    
    Optional<Producto> findByIdProd(Integer idProd);
    
/*    List <ProductoRepository> findAllByOrderById_prod(); */

}