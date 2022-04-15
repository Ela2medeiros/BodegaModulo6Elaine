package cl.icap.fullstackjava2022.modulo6.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cl.icap.fullstackjava2022.modulo6.model.entity.Producto;
import cl.icap.fullstackjava2022.modulo6.service.ProductoService;

@Controller
@RequestMapping("/producto") // http://localhost:8080/producto
public class ProductoController {
	@Autowired
	ProductoService productoService;
	
	@RequestMapping("/list") 
	public @ResponseBody List<Producto> list(HttpServletRequest request, HttpServletResponse response) {
		return productoService.list();
	}
	
	@RequestMapping("/listOrderByidProd") 
	public @ResponseBody List<Producto> listOrderByidProd(HttpServletRequest request, HttpServletResponse response) {
		return productoService.listOrderByidProd();
	}
	
	@PostMapping("/update") 
	public @ResponseBody Integer update(HttpServletRequest request, HttpServletResponse response) {
		int vret = 0;
		if (productoService.update(new Producto(Integer.parseInt(request.getParameter("id_prod")),request.getParameter("descrip_prod"),request.getParameter("unid_medida"),Integer.parseInt(request.getParameter("id_tprod")))) != null) {
			vret = 1;
		}
		return vret;
	}
	
	
	
	@PostMapping("/delete") 
	public @ResponseBody Integer delete(HttpServletRequest request, HttpServletResponse response) {
		return productoService.delete(Integer.parseInt(request.getParameter("id_prod")));
	}



	@RequestMapping("/insert") 
	public @ResponseBody Integer insert(HttpServletRequest request, HttpServletResponse response) {
		Integer vret = 0;
		if (productoService.insert(new Producto(Integer.parseInt(request.getParameter("id_prod")),request.getParameter("descrip_prod"),request.getParameter("unid_medida"),Integer.parseInt(request.getParameter("id_tprod")))) != null) {
			vret = 1;
		};
		return vret;
	}
	@RequestMapping("/select") 
	public @ResponseBody Producto select(HttpServletRequest request, HttpServletResponse response) {
		return productoService.get(Integer.parseInt(request.getParameter("id_prod")));
	}
	 
}