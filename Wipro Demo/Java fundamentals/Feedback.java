package day1and2;

public class Feedback {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Manisha Sahoo";
		String extra = " Welcome! ";

		System.out.println("Length: " + str.length());
		System.out.println("Char at index 2: " + str.charAt(2));
		System.out.println("Substring from index 5: " + str.substring(5));
		System.out.println("Substring from 0 to 4: " + str.substring(0, 4));
		System.out.println("Concatenated: " + str.concat(extra));

		System.out.println("Equals '" + extra + "': " + str.equals(extra));
		System.out.println("Equals Ignore Case '" + extra + "': " + str.equalsIgnoreCase(extra));
		System.out.println("CompareTo '" + extra + "': " + str.compareTo(extra));
		System.out.println("CompareToIgnoreCase '" + extra + "': " + str.compareToIgnoreCase(extra));

		System.out.println("Index of 'a': " + str.indexOf('a'));
		System.out.println("Index of \"ha\": " + str.indexOf("ha"));
		System.out.println("Last index of 'a': " + str.lastIndexOf("a"));
		System.out.println("Contains 'sha': " + str.contains("sha"));
		System.out.println("Starts with 'Man': " + str.startsWith("Man"));
		System.out.println("Ends with 'hoo': " + str.endsWith("hoo"));

		System.out.println("Lowercase: " + str.toLowerCase());
		System.out.println("Uppercase: " + str.toUpperCase());

		System.out.println("Trimmed: '" + extra.trim() + "'");
		System.out.println("Replace 'a' with '*': " + str.replace('a', '*'));
		System.out.println("Replace 'oo' with 'ee': " + str.replace("oo", "ee"));
		System.out.println("ReplaceAll 'a' with '@': " + str.replaceAll("a", "@"));
		System.out.println("ReplaceFirst 'a' with '#': " + str.replaceFirst("a", "#"));

		System.out.println("Matches only letters and spaces: " + str.matches("[A-Za-z ]+"));

		
		}
	}
