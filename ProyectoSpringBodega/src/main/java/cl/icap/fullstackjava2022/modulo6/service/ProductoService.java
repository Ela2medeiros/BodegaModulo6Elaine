package cl.icap.fullstackjava2022.modulo6.service;

import java.util.List;

import cl.icap.fullstackjava2022.modulo6.model.entity.Producto;

public interface ProductoService{
	public Producto get(Integer idProd);
	public Producto insert(Producto producto);
	public Producto update(Producto producto);
	public List<Producto> list();
	public List<Producto> listOrderByidProd();
	public int delete(Integer idProd);

}