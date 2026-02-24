package progam.datatype;

public class Hospital {
public static void main(String[] args) {
	
	String hospitalName="rada";
    String address="bhoari piune 39";
    int maxPatientCapacity=500;
    int currentPatients=345;
    int staffCount=56;
    boolean isEmergencyActive=true;
    double starRating=4.56;
    
    System.out.println("--- Hospital Management System ---");
    System.out.println("Hospital Name: " + hospitalName);
    System.out.println("Address: " + address);
    System.out.println("Max Capacity: " + maxPatientCapacity);
    System.out.println("Current Patients: " + currentPatients);
    System.out.println("Staff Count: " + staffCount);
    System.out.println("Emergency Status Active: " + isEmergencyActive);
    System.out.println("Rating: "+ starRating + " stars");

	
}
}
