package cl.worldparts.modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;





@Entity
@Table(name="PRODUCTS")
public class Product {
	
	@Id
	@Column(name="PRODUCT_ID")
	private int productId;
	
	@Column(name="PRODUCT_NAME")
	private String productName;
	
	@Column(name="DESCRIPTION")
	private String description;
	
	@Column(name="STANDARD_COST")
	private double standarsCost;
	
	@Column(name="LIST_PRICE")
	private double listPrice;
	
	@ManyToOne
	@JoinColumn(name = "category_id")
	private Categorie categorie;
	
	@OneToMany(mappedBy = "product" ,fetch = FetchType.EAGER)
    private List<Inventorie> lInventorie;

	public Product() {
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getStandarsCost() {
		return standarsCost;
	}

	public void setStandarsCost(double standarsCost) {
		this.standarsCost = standarsCost;
	}

	public double getListPrice() {
		return listPrice;
	}

	public void setListPrice(double listPrice) {
		this.listPrice = listPrice;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public List<Inventorie> getlInventorie() {
		return lInventorie;
	}

	public void setlInventorie(List<Inventorie> lInventorie) {
		this.lInventorie = lInventorie;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", description=" + description
				+ ", standarsCost=" + standarsCost + ", listPrice=" + listPrice + ", categorie=" + categorie
				+ ", lInventorie=" + lInventorie + "]";
	}
	
	
	
	

}
