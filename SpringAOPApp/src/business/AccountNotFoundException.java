package business;

public class AccountNotFoundException extends Exception {
	@Override
	public String toString() {
		return "Invalid Account";
	}
}
