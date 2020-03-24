import java.awt.Point;

public class StringPlay {
	public static void main(String[] args) {
		String string1 = "C++ is cool";
		String string2 = "I love Java";
		String string3 = string2.substring(7) + string1.substring(3);
		
		Point point1 = new Point(1,2);
		Point point2 = new Point(1,2);
		System.out.println(point1==point2);
		
		String s1 = "STRING OF MY CHOICE 1";
		String s2 = "string of my choice 2";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
	}
}