package cl.icap.fullstackjava2022.modulo6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebAppController {
	@RequestMapping("/")
	public String getHome() {
		return("index");
	}
	
	@RequestMapping("/empleado_page")
	public String getEmpleado() {
		return("empleado_page");
	}
	
	
	@RequestMapping("/producto_page")
	public String getProducto() {
		return("producto_page");
	}

	
}