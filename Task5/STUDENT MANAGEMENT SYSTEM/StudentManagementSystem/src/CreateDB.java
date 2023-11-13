import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

import com.mysql.cj.jdbc.StatementWrapper;
public class CreateDB {
    public static void main(String[] args) throws Exception {
        try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			 String url="jdbc:mysql://localhost:3306/studentmanagementsystem";
			 
			 String user="root";
			 String pass="admin";
			 Connection con=DriverManager.getConnection(url,user,pass);
            //  String sql="Create Database"+databaseName;
			//  PreparedStatement statement = Connection.createStatement();
			//  statement.executeUpdate(sql);
			//  statement.close();
			 //JOptionPane.showMessageDialog(null, statement, sql, 0);
             System.out.println("There is no error.....");
		 }catch(SQLException e)
		 {
			 System.out.println("There is an error");
		 }
    }
}
