package cl.worldparts.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.worldparts.modelo.Categorie;
import cl.worldparts.modelo.CategorieRepositorio;

@Service
public class CategorieServicioImpl implements CategorieServicio {

	@Autowired
	CategorieRepositorio cr;
	
	
	@Override
	public Categorie obtenerCategoriaPorId(int categoryId) {
		
		return cr.findOne(categoryId);
	}

}
