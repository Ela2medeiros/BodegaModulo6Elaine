package cl.icap.fullstackjava2022.modulo6.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cl.icap.fullstackjava2022.modulo6.model.entity.Empleado;
import cl.icap.fullstackjava2022.modulo6.service.EmpleadoService;

@Controller
@RequestMapping("/empleado") // http://localhost:8080/empleado
public class EmpleadoController {
	@Autowired
	EmpleadoService empleadoService;
	
	@RequestMapping("/list") 
	public @ResponseBody List<Empleado> list(HttpServletRequest request, HttpServletResponse response) {
		return empleadoService.list();
	}
	
	@RequestMapping("/listOrderByidRut") 
	public @ResponseBody List<Empleado> listOrderByidRut(HttpServletRequest request, HttpServletResponse response) {
		return empleadoService.listOrderByidRut();
	}
	
	@PostMapping("/update") 
	public @ResponseBody Integer update(HttpServletRequest request, HttpServletResponse response) {
		int vret = 0;
		if (empleadoService.update(new Empleado(Integer.parseInt(request.getParameter("id_rut")),request.getParameter("nombre"))) != null) {
			vret = 1;
		}
		return vret;
	}
	
	
	@PostMapping("/delete") 
	public @ResponseBody Integer delete(HttpServletRequest request, HttpServletResponse response) {
		return empleadoService.delete(Integer.parseInt(request.getParameter("id_rut")));
	}
	


	@RequestMapping("/insert") 
	public @ResponseBody Integer insert(HttpServletRequest request, HttpServletResponse response) {
		Integer vret = 0;
		if (empleadoService.insert(new Empleado(Integer.parseInt(request.getParameter("id_rut")),request.getParameter("nombre"))) != null) {
			vret = 1;
		};
		return vret;
	}
	@RequestMapping("/select") 
	public @ResponseBody Empleado select(HttpServletRequest request, HttpServletResponse response) {
		return empleadoService.get(Integer.parseInt(request.getParameter("id_rut")));
	}
	 
}