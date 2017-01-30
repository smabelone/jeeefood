package hibernatejsf.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * This Class is a POJO Class of Employees.
 * @author Matheus Silva de Almeida "almeida-matheus@hotmail.com.br".
 * @version 1.0
 * @since 17/07/2015 14:32:22
 */

/**
 * This Annotation says the Class is one Entity of database. 
 */
@Entity

/**
 * This Annotation says the Class is one Table, and the property "name" says what is name Table . 
 */
@Table(name="products_test")
public class ProduitModel {
	
	/**
	 * This Annotation says the entity is the primary key of the table.
	 */	
	@Id
	
	/**
	 * This Annotation says this entity have value incremented automatically.
	 */
	@GeneratedValue
	
	/**
	 * This Annotation says the variable is one entity, the property "name" says what is name of the table and 
	 * the property "nullable" says if the entity can be null.
	 */
	@Column(name="code",nullable=false)
	protected String codeProduit;
	
	@Column(name="url")
	protected String urlProduit;
	
	@Column(name="creator")
	protected String createurProduit;
	
	@Column(name="product_name")
	protected String nomProduit;
	
	@Column(name="quantity")
	protected String quantiteProduit;

	public String getCodeProduit() {
		return codeProduit;
	}

	public void setCodeProduit(String codeProduit) {
		this.codeProduit = codeProduit;
	}

	public String getUrlProduit() {
		return urlProduit;
	}

	public void setUrlProduit(String urlProduit) {
		this.urlProduit = urlProduit;
	}

	public String getCreateurProduit() {
		return createurProduit;
	}

	public void setCreateurProduit(String createurProduit) {
		this.createurProduit = createurProduit;
	}

	public String getNomProduit() {
		return nomProduit;
	}

	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}

	public String getQuantiteProduit() {
		return quantiteProduit;
	}

	public void setQuantiteProduit(String quantiteProduit) {
		this.quantiteProduit = quantiteProduit;
	}
	
	
	
}
