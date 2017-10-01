package eagerInitialization;

public class Captain {

	private static Captain _captain = new Captain();

	private Captain() {

	}

	public static Captain getACaptain() {
	
		return _captain;
	}

}
