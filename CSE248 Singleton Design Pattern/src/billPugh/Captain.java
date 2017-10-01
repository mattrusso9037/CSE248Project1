package billPugh;

public class Captain {
	private static Captain _captain;

	private Captain() {

	}

	
	//private inner class
	private static class SingletonHelper {
		private static final Captain _captain = new Captain();
	}

	public static Captain getACaptain(){
		return SingletonHelper._captain;
		
	}
	
}
