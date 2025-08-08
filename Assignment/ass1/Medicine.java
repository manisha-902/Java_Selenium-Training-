package ass1;

public class Medicine {
	static int totalMedicinesSold = 0;
    String userName;
    int dailyDosage;
    
    Medicine(String userName, int dailyDosage) {
        this.userName = userName;
        this.dailyDosage = dailyDosage;
        totalMedicinesSold++;
    }

    void trackDosage() {
        int doseToday = dailyDosage; 
        System.out.println(userName + " should take " + doseToday + " doses today.");
    }

    public static void main(String[] args) {
        Medicine med = new Medicine("Amit", 2);
        med.trackDosage();
        System.out.println("Total Medicines Sold: " + Medicine.totalMedicinesSold);
    }
}
