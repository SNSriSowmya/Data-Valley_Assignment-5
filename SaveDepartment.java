import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class SaveDepartment 
{
	public static void main(String[] args) throws SQLException {
		Connection connection=null;
		try 
		{
			connection=DatabaseConnection.getDatabaseConnection();
			
			Statement statement=connection.createStatement();
			
			//Department d1=new Department(101,"CSE");
			//Department d2=new Department(102,"IT");
			//Department d3=new Department(103,"ECE");
			Department d4=new Department(104,"EEE");
			
			String query="insert into department(department_id,department_name) values('"+d4.getDepartment_id()+"','"+d4.getDepartment_name()+"')";
			
			int status=statement.executeUpdate(query);
			
			System.out.println(status+" department object stored in database table");

		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			connection.close();
		}
	}
}
