import java.sql.*;

/**
 * 
 */

/**
 * @author saifahmad
 *
 */
public class DBOps {
	
	Connection dbConnection;
	
	DBOps() {
		try {
			Class c = Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(Exception e) {
			System.out.println("Driver issue: " + e);
			System.exit(0);
		}
	}
	
	
	private void getDBConnect() {
		try {
			this.dbConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop", "learner", "learner");
		}
		catch(Exception e) {
			System.out.println("Connected failed: " + e);
		}
	}
	
	
	public Connection init() {
		this.getDBConnect();
		return this.dbConnection;
	}
	
	
	public void done() {
		try {
			if(this.dbConnection != null) { 
				dbConnection.close();
				System.out.println("DB Connection closed");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
