import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	private static final String DRIVER_NAME="com.mysql.cj.jdbc.Driver";
	private static final String DATABASE_URL="jdbc:mysql://localhost:3306/departments";
	private static final String DATABASE_USERNAME="root";
	private static final String DATABASE_PASSWORD="MySQL@14";
	
	public static Connection getDatabaseConnection()throws SQLException
	{
		Connection connection =null;
		try
		{
			Class.forName(DRIVER_NAME);	
			connection=DriverManager.getConnection(DATABASE_URL,DATABASE_USERNAME,DATABASE_PASSWORD);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally 
		{
			
		}
		return connection;
	}
}
