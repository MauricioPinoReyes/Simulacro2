package cl.worldparts.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.worldparts.modelo.Warehouse;
import cl.worldparts.modelo.WarehouseRepositorio;

@Service
public class WarehouseServicioImpl implements WarehouseServicio{

	@Autowired
	WarehouseRepositorio wr;
	
	@Override
	public Warehouse obtenerReporteAlmacenesPorId(int warehouseId) {
		
		return wr.findOne(warehouseId);
	}

	@Override
	public List<Warehouse> obtenerAlmacenes() {
		
		return (List<Warehouse>) wr.findAll();
	}

}
