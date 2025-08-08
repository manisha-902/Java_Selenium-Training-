package day9;
import java.util.HashMap;

class PatientDetail {
    int id;
    String name;
    String disease;

    public PatientDetail(int id, String name, String disease) {
        this.id = id;
        this.name = name;
        this.disease = disease;
    }
    public int getID(){
    	return id;
    }
    public String getName(){
    	return name;
    }
    public String getDisease(){
    	return disease;
    }

    public String toString() {
        return "Patient ID: " + id + ", Name: " + name + ", Disease: " + disease;
    }
}
public class HospitalMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, PatientDetail> patientMap = new HashMap<>();
        
        patientMap.put(1, new PatientDetail(1, "Manisha", "Fever"));
        patientMap.put(2, new PatientDetail(2, "Srusti", "Diabetes"));
        patientMap.put(3, new PatientDetail(3, "Manas", "Asthma"));
        
        System.out.println("Total Patient: " +patientMap.size());
        
        System.out.println("\n Initial Patient Records:");
        for (PatientDetail p : patientMap.values()) {
            System.out.println(p);
        }
        
        if (patientMap.containsKey(2)) {
            PatientDetail existing = patientMap.get(2);
            patientMap.put(2, new PatientDetail(existing.id, "Rohit", existing.disease));
            System.out.println("\n Name updated for patient ID 2.");
        }
        
        patientMap.remove(1);
        System.out.println("\n Removed patient with ID 1.");
        
        System.out.println("\n After Update and Remove:");
        for (PatientDetail p : patientMap.values()) {
            System.out.println(p);
        }
        
        patientMap.clear();
        System.out.println(" \n All patient records cleared.");

    }
}

