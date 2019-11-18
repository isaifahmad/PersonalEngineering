import java.sql.Connection;
import java.util.ArrayList;
import java.sql.*;

/**
 * 
 */

/**
 * @author saifahmad
 *
 */
public class ShopCrudExample {

	Connection conObj;
	Statement stateObj;
	DBOps dbObj; 
	ResultSet result;
	
	ShopCrudExample() {
		try {
			this.dbObj = new DBOps();
			this.conObj = this.dbObj.init();
			this.stateObj = this.conObj.createStatement();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/* 
	 * Method for adding a new Category.
	 */
	public void addCategory(String catName) {
		try {
			
			String sql = "INSERT INTO category(name, created_at, updated_at) VALUES('" + catName + "', now(), now())";
			this.stateObj.execute(sql);
			System.out.println("A new category(" + catName + ") successfully added");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	/*
	 * Method for retrieving list of categories.
	 */
	public ArrayList<String> getCategories() {
		ArrayList<String> categoryName = new ArrayList<String>();
		try {
			String sql = "SELECT name FROM shop.category";
			this.result = this.stateObj.executeQuery(sql);
			
			while(result.next()) {
				categoryName.add(result.getString(1));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return categoryName;
	}
	
	
	/*
	 * Method for changing name of a Category.
	 * @param 
	 * 	String name of new category <newCategory>, 
	 * 	String name of old category <oldCategory>
	 */
	public void updateCategory(String newCategory, String oldCategory) {
		
		String sql = "UPDATE shop.category SET name='" + newCategory + "' WHERE name='" + oldCategory + "'";
		
		try {
			this.stateObj.execute(sql);
		}
		catch(Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
		
		System.out.println(oldCategory + " has successfully modified to " + newCategory);
		
	}
	
	
	public void close() {
		this.dbObj.done();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ShopCrudExample shopObj = new ShopCrudExample();
		 
		System.out.println("DB connection established");
		
		// Adding a new Category 
		//shopObj.addCategory("Pens");
		
		// Getting list of categories
		ArrayList<String> categories = new ArrayList<String>(); 
		categories = shopObj.getCategories();
		System.out.println("Categories:" + categories);
		
		
		// Modifying name of a Category 
		shopObj.updateCategory("Wind Chimes", "Pens");
		
		// Getting list of categories 
		categories = shopObj.getCategories();
		System.out.println("Categories:" + categories);
				
		
		
		shopObj.close();
		

	}

}
