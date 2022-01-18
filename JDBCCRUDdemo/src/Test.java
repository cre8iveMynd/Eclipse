import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//1. loading driver class
		Class.forName("oracle.jdbc.OracleDriver");	
		
		//2. create connection
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@Localhost1521:xe","jayesh","jayesh123");
		
		// 3. create statement
		Statement stmt = conn.createStatement();
		
		//4. execute querry
		//ddl = execute(); , dml = executeUpdate();, drl : executeQuery();
		boolean result = stmt.execute("create table empJayesh(eid number,ename varchar2(10))");
		
		   //int result = stmt.executeUpdate("insert into empjayesh values(123, 'jayesh')");
		//close the connection
		conn.close(); 
		
		System.out.println("Table is created");
	}

}
