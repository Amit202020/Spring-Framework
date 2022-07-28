package pp;

public class AccountNumberDoesNotExistException  extends  Exception {

	@Override
	public String toString() {
		return  "This  is an invalid account";
	}

}
