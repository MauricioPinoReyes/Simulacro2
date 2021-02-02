package cl.worldparts.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cl.worldparts.modelo.Categorie;
import cl.worldparts.modelo.Inventorie;
import cl.worldparts.modelo.Product;
import cl.worldparts.modelo.Warehouse;
import cl.worldparts.servicio.CategorieServicio;
import cl.worldparts.servicio.WarehouseServicio;

@Controller
public class WarehouseControlador {

	
	@Autowired
	CategorieServicio cs;
	
	@Autowired
	WarehouseServicio ws;
	
	
	@RequestMapping("/inicio")
	public String mostrarinicio(Model m) {
	
		return "form-inicio";
	}
	
	@RequestMapping("/procesar")
	public String procesarInicio(Model m, @RequestParam("txtIdWarehouse") int warehouseId) {
		Warehouse warehouse = ws.obtenerReporteAlmacenesPorId(warehouseId);
		List<Inventorie> lisInventario = warehouse.getlInventorie();
		
		//lisInventario.get(0).getProduct().getCategorie().getCategoryId()
		
	    m.addAttribute("ware", warehouse);
		m.addAttribute("inv", lisInventario);
		
		return "form-procesa";
	}
	
	@RequestMapping("/procesarCategoria")
	public String procesarInicioCategoria(Model m, @RequestParam("txtIdCategoria") int categoryId) {
		Categorie categoria = cs.obtenerCategoriaPorId(categoryId);
		//List<Product> lisInventario = categoria
		
	    //m.addAttribute("ware", warehouse);
		//m.addAttribute("inv", lisInventario);
		
		return "form-procesa";
	}
	
}
