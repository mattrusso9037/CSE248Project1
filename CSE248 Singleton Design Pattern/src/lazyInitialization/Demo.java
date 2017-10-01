package lazyInitialization;


public class Demo {

	public static void main(String[] args) {

		Captain c1 = Captain.getACaptain();
		System.out.println("A captain is made");
	
		
		Captain c2 = Captain.getACaptain();
		System.out.println(c1==c2);
	}

}
