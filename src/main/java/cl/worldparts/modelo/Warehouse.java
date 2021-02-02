package cl.worldparts.modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="WAREHOUSES")
public class Warehouse {

	@Id
	@Column(name="WAREHOUSE_ID")
	private int warehouseId;
	
	@Column(name="WAREHOUSE_NAME")
	private String warehouseName;
	
	@Column(name="LOCATION_ID")
	private int locationId;
	
	@OneToMany(mappedBy = "warwhouse", fetch = FetchType.EAGER)
    private List<Inventorie> lInventorie;

	public Warehouse() {
	}

	public Warehouse(int warehouseId, String warehouseName, int locationId, List<Inventorie> lInventorie) {
		this.warehouseId = warehouseId;
		this.warehouseName = warehouseName;
		this.locationId = locationId;
		this.lInventorie = lInventorie;
	}

	public int getWarehouseId() {
		return warehouseId;
	}

	public void setWarehouseId(int warehouseId) {
		this.warehouseId = warehouseId;
	}

	public String getWarehouseName() {
		return warehouseName;
	}

	public void setWarehouseName(String warehouseName) {
		this.warehouseName = warehouseName;
	}

	public int getLocationId() {
		return locationId;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	public List<Inventorie> getlInventorie() {
		return lInventorie;
	}

	public void setlInventorie(List<Inventorie> lInventorie) {
		this.lInventorie = lInventorie;
	}

	@Override
	public String toString() {
		return "Warehouse [warehouseId=" + warehouseId + ", warehouseName=" + warehouseName + ", locationId="
				+ locationId + ", lInventorie=" + lInventorie + "]";
	}
	
	
	

}
