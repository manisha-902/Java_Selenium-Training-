package ass1;

public class UserRoleAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String role = "User"; 

		System.out.println("Selected Role: " + role);
		System.out.println("Access Permissions:");

		switch (role) {
		case "Admin":
			System.out.println("- Full access to all modules");
			System.out.println("- Can add/remove users");
			System.out.println("- Can view and modify data");
			break;

		case "User":
			System.out.println("- Limited access to data");
			System.out.println("- Can view and update own profile");
			System.out.println("- Cannot manage users");
			break;

		case "Guest":
			System.out.println("- Read-only access");
			System.out.println("- Can browse public information");
			break;

		default:
			System.out.println("Invalid Role. Please use Admin, User, or Guest.");
		}
	}

}
