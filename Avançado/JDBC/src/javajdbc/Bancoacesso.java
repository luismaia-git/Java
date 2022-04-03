package javajdbc;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;

public class Bancoacesso {

	public static void main(String[] args) throws Exception {
		String sql = "SELECT codigo, nome, sexo, email FROM PESSOA";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		try ( Connection con = DriverManager.getConnection(url, "SYSTEM", "140701"); 
		PreparedStatement stm = con.prepareStatement(sql);
		ResultSet rs = stm.executeQuery()) {
			
			while(rs.next()) {
				System.out.println(rs.getString("nome"));
			}
			
		}
	}

}
