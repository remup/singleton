
public class SingletonClass {

	private static SingletonClass s2 = null;

	public static SingletonClass getInstance() {
		if (s2 == null) {
			synchronized (SingletonClass.class) {
				if (s2 == null) {
					s2 = new SingletonClass();

				}
			}

		}
		return s2;
	}

	@Override
	public String toString() {
		return "SingletonClass";
	}

}
