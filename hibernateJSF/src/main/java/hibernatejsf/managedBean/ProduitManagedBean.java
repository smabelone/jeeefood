package hibernatejsf.managedBean;

import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import hibernatejsf.dao.ProduitDAO;
import hibernatejsf.model.ProduitModel;

@ManagedBean
@ViewScoped
/**
 * This Class is the ManagedBean of the Employees, 
 * ManagedBean is the Class responsible for provide integration of the xhtml page with business rule(Controller). 
 * @author Matheus Silva de Almeida "almeida-matheus@hotmail.com.br".
 * @version 1.0
 * @since 18/07/2015 20:16:25
 */
public class ProduitManagedBean extends ProduitModel {
	
	/**
	 * This is a Employees list.
	 */
	private ArrayList<ProduitModel> listProduits;	
	

	/**
	 * This Annotation says the following method will executed as soon as the ManagedBean is called. 
	 */
	@PostConstruct
	public void onCreate(){		
		
		/**
		 * Instance of the listEmployees.
		 */
		setListProduits(new ArrayList<ProduitModel>());		
			
	
		/**
		 * Calling the Method loadListOfEmployess.
		 */
		loadListOfProduits();
	}
	
	
	/**
	 * The aim of the method is to load {@link #listEmployees} with the data from the table Employees.
	 */
	public void loadListOfProduits(){		
		
		setListProduits(ProduitDAO.getInstance().selectAllProduits());		
		
	}


	public ArrayList<ProduitModel> getListProduits() {
		return listProduits;
	}


	public void setListProduits(ArrayList<ProduitModel> listProduits) {
		this.listProduits = listProduits;
	}
	

}
