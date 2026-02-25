package progam.varibles;

public class Hospital {
	static String hospitalName = "rada";
	static String address = "bhoari piune 39";
	static int maxPatientCapacity = 500;
	static int currentPatients = 345;
	static int staffCount = 56;
	static boolean isEmergencyActive;
	static double starRating;

	public static void main(String[] args) {
		System.out.println("--- Hospital Management System ---");
		System.out.println("Hospital Name: " + hospitalName);
		System.out.println("Address: " + address);
		System.out.println("Max Capacity: " + maxPatientCapacity);
		System.out.println("Current Patients: " + currentPatients);
		System.out.println("Staff Count: " + staffCount);
		System.out.println("Emergency Status Active: " + isEmergencyActive);
		System.out.println("Rating: " + starRating + " stars");

	}

}
