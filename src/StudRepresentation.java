package basics;

/**
 * Attributes of given high students 
 * @see Learning Java 
 * @author Kathryn Hodge 
 */
public class StudRepresentation {

    public static void main(String[] args) {
	/*
	 * Local variable is a variable that is accessible 
	 * within a specific part of a program 
	 */
	int studentAge = 19; 
	double studentGPA = 6.6; 
	char firstInitial = 'S';
	String studentName = "ELISA"; 
	boolean hasAttendance = true; 
	
	System.out.print("Name " +firstInitial +".");
	System.out.println(studentName);
	System.out.println("Age " +studentAge);
	System.out.println("GPA " +studentGPA);
	System.out.println("Attendance "+hasAttendance);
	// String index of ELISA --> 0 1 2 3 4 
	// charAt(5) string out of range
	System.out.println("Char index "+studentName.charAt(5));
    }

}
