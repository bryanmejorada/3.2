
import java.util.Scanner;

public class FP {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String corUsername = "BryanMejorada";
		{
			String corPassword = "CSC200";
			String username = "";
			String password = "";

			System.out.println("Please enter a Username: ");
			username = input.next();

			System.out.println("Please enter a Password: ");
			password = input.next();

			if (corUsername.equals(username) && corPassword.equals(password)) {
				System.out.println("Welcome " + corUsername + "!");

			} else {
				System.out.println("Wrong Username or Password!");
			}

		}
	}
}
