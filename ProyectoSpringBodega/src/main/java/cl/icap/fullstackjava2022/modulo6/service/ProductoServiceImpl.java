package cl.icap.fullstackjava2022.modulo6.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.icap.fullstackjava2022.modulo6.model.entity.Producto;
import cl.icap.fullstackjava2022.modulo6.model.repository.ProductoRepository;
import cl.icap.fullstackjava2022.modulo6.service.ProductoService;


@Service
public class ProductoServiceImpl implements ProductoService {
	@Autowired
	ProductoRepository productoRepository;

	public ProductoServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Producto get(Integer id_prod) {
		return productoRepository.findByIdProd(id_prod).get();
	}

	@Override
	public Producto insert(Producto producto) {
		return productoRepository.save(producto);
	}

	
	@Override
	public int delete(Integer id_prod) {
		int vret = 0;

		try {
			productoRepository.delete(new Producto(id_prod, null, null,null));
			vret = 1;
		} catch (Exception e) {
			e.printStackTrace();
			vret = 0;
		}

		return vret;
	}
	
		
	@Override
	public Producto update(Producto producto) {
		return productoRepository.save(producto);
	}
	
	@Override
	public List<Producto> list() {
		return productoRepository.findAll();
	}


	@Override
	public List<Producto> listOrderByidProd() {
		// TODO Auto-generated method stub
		return null;
	}

}
