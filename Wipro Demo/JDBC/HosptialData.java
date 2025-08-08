package JDBCDay10and11;
import java.sql.*;
import java.sql.Date;
import java.util.*;
public class HosptialData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hospital", "root", "Manisha@902");
			/*String sql = "CREATE TABLE IF NOT EXISTS patients (" + "id INT AUTO_INCREMENT PRIMARY KEY, "+ "name VARCHAR(100), "+ "age INT, "
                    + "disease VARCHAR(100), "+ "admission_date DATE, "+ "doctor_assigned VARCHAR(100))";
			
			Statement stmt = con.createStatement();
            stmt.executeUpdate(sql);
            stmt.close();
            System.out.println("Table 'patients' created successfully");*/
			

			System.out.print("Enter Patient Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Enter Disease: ");
            String disease = scanner.nextLine();

            System.out.print("Enter Admission Date (YYYY-MM-DD): ");
            String admissionDate = scanner.nextLine();

            System.out.print("Enter Doctor Assigned: ");
            String doctor = scanner.nextLine();
            
            String sql = "INSERT INTO patients (name, age, disease, admission_date, doctor_assigned) VALUES (?, ?, ?, ?, ?)";

            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.setString(3, disease);
            pstmt.setDate(4, Date.valueOf(admissionDate));
            pstmt.setString(5, doctor);
            int rowsInserted = pstmt.executeUpdate();

            if (rowsInserted > 0) {
                System.out.println("Patient registered successfully!");
            }
            System.out.print("Do you want to delete a patient? (yes/no): ");
            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("yes")) {
                System.out.print("Enter name of patient to delete: ");
                String deleteName = scanner.nextLine();

                String deleteSql = "DELETE FROM patients WHERE name = ?";
                PreparedStatement deleteStmt = con.prepareStatement(deleteSql);
                deleteStmt.setString(1, deleteName);

                int deleted = deleteStmt.executeUpdate();
                if (deleted > 0) {
                    System.out.println("Patient deleted successfully.");
                } else {
                    System.out.println("No patient found with that name.");
                }
                deleteStmt.close();
            }
            System.out.print("Do you want to update a patient record? (yes/no): ");
            String updateChoice = scanner.nextLine();

            if (updateChoice.equalsIgnoreCase("yes")) {
                System.out.print("Enter the existing patient name to update: ");
                String oldName = scanner.nextLine();

                System.out.print("Enter the new patient name: ");
                String newName = scanner.nextLine();

                System.out.print("Enter the new admission date (YYYY-MM-DD): ");
                String newAdmissionDate = scanner.nextLine();

                String updateSql = "UPDATE patients SET name = ?, admission_date = ? WHERE name = ?";
                PreparedStatement updateStmt = con.prepareStatement(updateSql);
                updateStmt.setString(1, newName);
                updateStmt.setDate(2, Date.valueOf(newAdmissionDate));
                updateStmt.setString(3, oldName);

                int updated = updateStmt.executeUpdate();
                if (updated > 0) {
                    System.out.println("Patient record updated successfully.");
                } else {
                    System.out.println("No matching patient found.");
                }
                updateStmt.close();
            }
            pstmt.close();
			con.close();
			scanner.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

