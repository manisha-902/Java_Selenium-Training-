package day9;
import java.util.TreeSet;
public class HospitalRooms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String>rooms = new TreeSet<>();
		
		rooms.add("ICU - 203");
		rooms.add("GEN - 203");
		rooms.add("ICU - 305");
		rooms.add("GEN - 205");
		rooms.add("ICU - 453");
		
		System.out.println("Available Rooms (Sorted by Name):");
		for (String room:rooms) {
			System.out.println("Room:"+room);
		}
		System.out.println("First Room:" +rooms.first());
		System.out.println("Last Room:" +rooms.last());
	}

}
