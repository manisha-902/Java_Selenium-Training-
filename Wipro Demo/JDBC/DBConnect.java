package JDBCDay10and11;

import java.sql.*;

public class DBConnect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hospital","root","Manisha@902");

			/*System.out.println("Connected Successfully");
			Statement stmt = con.createStatement();
			
			String sql ="CREATE TABLE IF NOT EXISTS patient("+"id INT PRIMARY KEY AUTO_INCREMENT,"+ "name VARCHAR(100),"+"age INT,"+"disease VARCHAR(100))";
			
			stmt.executeUpdate(sql);
			System.out.println("Table 'patient' created successfully.");*/
					
			/*String sql="INSERT INTO patient(name, age, disease) VALUES(?, ?, ?)";
			
			PreparedStatement pstmt=con.prepareStatement(sql);
			
			/*pstmt.setString(1, "Manisha");
			pstmt.setInt(2, 24);
			pstmt.setString(3, "cold");
			
			int rowsInserted=pstmt.executeUpdate();
			if(rowsInserted>0)
			{
				System.out.println("Patient inserted successfully");
			}	
			
			/*String[][] data=
				{
						{"Manas", "22", "Fever"},
						{"Srusti", "23", "Cold"},
						{"Rajesh", "22", "headche"},
						{"Meenu", "22", "Pain"}
				};
					for(String[] row : data)
				{
					pstmt.setString(1, row[0]);
					pstmt.setInt(2, Integer.parseInt(row[1]));
					pstmt.setString(3, row[2]);
					pstmt.executeUpdate();
				}
				System.out.println(" All patients inserted successfully");*/
			/*String sql ="UPDATE patient SET age = ? WHERE name = ?";
			PreparedStatement pstmt=con.prepareStatement(sql);
			
				pstmt.setInt(1, 24);
				pstmt.setString(2, "Rajesh");
				int row = pstmt.executeUpdate();
				
				System.out.println("Updated Successfully");*/
			String sql ="UPDATE patient SET disease = ? WHERE name = ? AND age =?";
			PreparedStatement pstmt=con.prepareStatement(sql);
			String[][] data=
				{
						{"Manas", "22", "skin"},
						{"Srusti", "23", "flu"},
				};
			for(String[] row : data)
			{
				pstmt.setString(1, row[2]);
				pstmt.setString(2, row[0]);
				pstmt.setInt(3, Integer.parseInt(row[1]));
				pstmt.executeUpdate();
				}
			System.out.println("Updated Successfully");
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

