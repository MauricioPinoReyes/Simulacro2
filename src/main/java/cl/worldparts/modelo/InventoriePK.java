package cl.worldparts.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class InventoriePK implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column(name = "warehouseId")
    int warehouseId;

    @Column(name = "productId")
    int productId;

	public InventoriePK() {
	}

	public int getWarehouseId() {
		return warehouseId;
	}

	public void setWarehouseId(int warehouseId) {
		this.warehouseId = warehouseId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
    
	
}
