package cl.worldparts.servicio;


import java.util.List;

import cl.worldparts.modelo.Warehouse;

public interface WarehouseServicio {

	Warehouse obtenerReporteAlmacenesPorId(int warehouseId);
	
	List<Warehouse> obtenerAlmacenes();
}
