package cl.worldparts.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import cl.worldparts.modelo.Warehouse;
import cl.worldparts.servicio.CategorieServicio;
import cl.worldparts.servicio.WarehouseServicio;

@RestController
public class RestControlador {
	
	@Autowired
	WarehouseServicio ws;
	
	
	@Autowired
	CategorieServicio cs;
	
	
	@RequestMapping(value = "/warelist", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Warehouse> getWarehouse() {
		List<Warehouse> listaWarehouse =ws.obtenerAlmacenes() ;
		return listaWarehouse;
	}
	
	
	
	
	
	
	
}
