package hibernatejsf.dao;

import java.util.ArrayList;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import hibernatejsf.factory.SessionFactoryProvider;
import hibernatejsf.model.ProduitModel;
/**
 * This Class is responsible for provide access to data(Data Access Object). 
 * @author Matheus Silva de Almeida "almeida-matheus@hotmail.com.br".
 * @version 1.0
 * @since 17/07/2015 13:57:35
 */
public class ProduitDAO {
	
	SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();
	
	/**
	 * This is the instance of EmployeeDAO.
	 */
	private static ProduitDAO instance;
	
	public static ProduitDAO getInstance(){
		
		if(instance == null){	
			
			instance = new ProduitDAO();
		}		
		return instance;
	}
	
	/**
	 * This method is responsible for select all employees in table Employees.
	 * @return This return is one ArrayList of EmployeeModel, 
	 * loaded with query results to the Employees table.
	 */	
	public ArrayList<ProduitModel> selectAllProduits(){
		
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(ProduitModel.class);
		
		ArrayList<ProduitModel> listProduits = (ArrayList<ProduitModel>) criteria.list();
		
		session.close();
		
		return listProduits;		
	}
	
	/**
	 * This method is responsible for select one employee in table Employees.
	 * @param idEmployee This parameter is primary key of Employee.
	 * @return This return is one EmployeeModel object, 
	 * loaded with query result to the Employees table.
	 */
	public ProduitModel selectProduitByID(String idProduit){
	
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(ProduitModel.class);
		criteria.add(Restrictions.eq("codeProduit", idProduit));
		
		ProduitModel produitModel = (ProduitModel) criteria.uniqueResult();
		
		session.close();
		
		return produitModel;		
	}
	

}
