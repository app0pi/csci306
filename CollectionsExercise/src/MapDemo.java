import java.util.*;

/* Author: Kenny Lieu
 * Answer 1: If a TreeMap is used, the printed entries are in alphabetical order.
 * Answer 2: The error says "Cannot instantiate the type Map<String,String>".
 */

public class MapDemo {
	private Map<String, String> mapCourses;
	
	public MapDemo() {
		mapCourses = new TreeMap<String, String>();
	}
	
	public void GetCourses() {
		Scanner in = new Scanner(System.in);
		String student = "";
		String course = "";
		do 
		{
			System.out.print("Enter a student or Q to quit: ");
			student = in.next();
			if (!(student.equalsIgnoreCase("Q"))) {
				System.out.print("Enter the student's favorite course or Q to quit: ");
				course = in.next();
			}
			else
				break;
			if (!(course.equalsIgnoreCase("Q")))
				mapCourses.put(student, course);
		} while (!(student.equalsIgnoreCase("Q")) && !(course.equalsIgnoreCase("Q")));
	}
	
	public void PrintCourses() {
		for (Map.Entry<String,String> entry : mapCourses.entrySet())
			System.out.println(entry.getKey() + " likes " + entry.getValue());
	}
	
	public static void main(String[] args) {
		MapDemo md = new MapDemo();
		md.GetCourses();
		md.PrintCourses();
	}
}
