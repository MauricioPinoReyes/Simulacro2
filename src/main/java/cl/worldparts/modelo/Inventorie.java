package cl.worldparts.modelo;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;


@Entity
@Table(name="INVENTORIES")
public class Inventorie {
	
	@EmbeddedId
	private InventoriePK id;
	
	@ManyToOne
    @MapsId("warehouseId")
    @JoinColumn(name = "warehouse_id")
	private Warehouse warwhouse;
	
	@ManyToOne
    @MapsId("productId")
    @JoinColumn(name = "product_id")
	private Product product;
	
	
	
	@Column(name="QUANTITY")
	private int quantity;



	public Inventorie() {
	}



	public Inventorie(InventoriePK id, Warehouse warwhouse, Product product, int quantity) {
		this.id = id;
		this.warwhouse = warwhouse;
		this.product = product;
		this.quantity = quantity;
	}



	public InventoriePK getId() {
		return id;
	}



	public void setId(InventoriePK id) {
		this.id = id;
	}



	public Warehouse getWarwhouse() {
		return warwhouse;
	}



	public void setWarwhouse(Warehouse warwhouse) {
		this.warwhouse = warwhouse;
	}



	public Product getProduct() {
		return product;
	}



	public void setProduct(Product product) {
		this.product = product;
	}



	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	@Override
	public String toString() {
		return "Inventorie [id=" + id + ", warwhouse=" + warwhouse + ", product=" + product + ", quantity=" + quantity
				+ "]";
	}
	
	
	
	
	
	
	
	
}
