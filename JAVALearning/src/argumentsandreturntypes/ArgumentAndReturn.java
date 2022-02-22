package argumentsandreturntypes;

public class ArgumentAndReturn {

	public static boolean argsAndReturn(int a, int b) {

		int c = a + b;

		if (c == 20)
			return true;

		return false;

	}

	public static void main(String[] args) {

		System.out.println(argsAndReturn(10, 10));

		System.out.println(argsAndReturn(20, 50));

	}

}
