 import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please input your name: ");
		String name = s.next();
		System.out.println("Hello, " + name);
		s.close();
	}

}