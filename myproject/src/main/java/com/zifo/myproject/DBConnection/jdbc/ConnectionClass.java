package com.zifo.myproject.DBConnection.jdbc;
import java.sql.* ;  // for standard JDBC programs
import java.math.* ; // for BigDecimal and BigInteger support

public class ConnectionClass {

	public static void main(String[] args) throws SQLException {
		try {
			   Class.forName("oracle.jdbc.driver.OracleDriver");
			}
			catch(ClassNotFoundException ex) {
			   System.out.println("Error: unable to load driver class!");
			   System.exit(1);
			}
		//String URL = "jdbc:oracle:thin:training/training@Zifocorp49:1521:orclzifo49";
		String URL = "jdbc:oracle:thin:@Zifocorp49:1521:orclzifo49";
		String USER = "training";
		String PASS = "training";
		Connection con = DriverManager.getConnection(URL, USER, PASS);
		//Connection con = DriverManager.getConnection(URL);
	
	//step3 create the statement object  
		try {
			   String sql = "DELETE FROM EMPDETAIL WHERE id = ?";
			   PreparedStatement statement = con.prepareStatement(sql);
			   statement.setInt(1, 900);
			   statement.executeUpdate();
			   System.out.println("Record deleted.");
			} catch (SQLException e) {
			   e.printStackTrace();
			}
	  
	//step4 execute query  
//	ResultSet rs=stmt.executeQuery("select * from student");  
//	while(rs.next())  
//	System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
//	  
	//step5 close the connection object  
	con.close();
	}
}
