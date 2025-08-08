package day3;

public class Department {
	private String deptName;
    private String location;

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public String getDeptName() {
        return deptName;
    }

    public String getLocation() {
        return location;
    }

    public void displayDetails() {
        System.out.println("Department Name: " + deptName);
        System.out.println("Location: " + location);
    }
}
