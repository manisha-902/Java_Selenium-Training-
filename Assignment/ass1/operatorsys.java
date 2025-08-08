package ass1;

public class operatorsys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 5;
		boolean flag = true;
		String type = "assignment"; // Change this to test different operators

		switch (type) {
		case "arithmetic":
			System.out.println("Arithmetic Operations:");
			System.out.println("a + b = " + (a + b));
			System.out.println("a - b = " + (a - b));
			System.out.println("a * b = " + (a * b));
			System.out.println("a / b = " + (a / b));
			System.out.println("a % b = " + (a % b));
			break;

		case "relational":
			System.out.println("Relational Operations:");
			System.out.println("a == b: " + (a == b));
			System.out.println("a != b: " + (a != b));
			System.out.println("a > b: " + (a > b));
			System.out.println("a < b: " + (a < b));
			System.out.println("a >= b: " + (a >= b));
			System.out.println("a <= b: " + (a <= b));
			break;

		case "logical":
			System.out.println("Logical Operations:");
			System.out.println("(a > 5 && b < 10): " + (a > 5 && b < 10));
			System.out.println("(a < 5 || b < 10): " + (a < 5 || b < 10));
			System.out.println("!flag: " + (!flag));
			break;

		case "assignment":
			System.out.println("Assignment Operations:");
			int x = 15;
			x += 5;
			System.out.println("x += 5 → " + x);
			x -= 3;
			System.out.println("x -= 3 → " + x);
			x *= 2;
			System.out.println("x *= 2 → " + x);
			x /= 4;
			System.out.println("x /= 4 → " + x);
			x %= 3;
			System.out.println("x %= 3 → " + x);
			break;

		case "unary":
			System.out.println("Unary Operations:");
			int u = 7;
			System.out.println("Initial u = " + u);
			System.out.println("++u = " + (++u));
			System.out.println("--u = " + (--u));
			System.out.println("-u = " + (-u));
			System.out.println("+u = " + (+u));
			System.out.println("!flag = " + (!flag));
			break;

		case "bitwise":
			System.out.println("Bitwise Operations:");
			System.out.println("a & b = " + (a & b));
			System.out.println("a | b = " + (a | b));
			System.out.println("a ^ b = " + (a ^ b));
			System.out.println("~a = " + (~a));
			System.out.println("a << 1 = " + (a << 1));
			System.out.println("a >> 1 = " + (a >> 1));
			System.out.println("a >>> 1 = " + (a >>> 1));
			break;

		case "ternary":
			System.out.println("Ternary Operation:");
			int max = (a > b) ? a : b;
			System.out.println("Max of a and b = " + max);
			break;

		case "instanceof":
			System.out.println("Instanceof Operation:");
			String text = "Hello";
			System.out.println("Is text a String? " + (text instanceof String));
			break;

		default:
			System.out.println("Invalid operator type selected.");
		}
	}

}
