package cl.worldparts.modelo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface WarehouseRepositorio extends CrudRepository<Warehouse,Integer> {

}
