package billPugh;

public class Demo {

	public static void main(String[] args) {
		Captain c1 = Captain.getACaptain();
		System.out.println("Cap is created");

		Captain c2 = Captain.getACaptain();
		if (c1 == c2) {
			System.out.println("there is only one cap");
		}
	}
}
