package lazyInitialization;

public class Captain {

	private static Captain _captain;

	private Captain() {

	}

	public static Captain getACaptain() {

		if (_captain == null) {
			_captain = new Captain();
			System.out.println("a new captain is created");
		} else {
			System.out.println("Rogers isn't dead yet");
		}
		return _captain;
	}

}
