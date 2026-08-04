package abstraction;

public class Twitter implements SocialMedia {

	@Override
	public void login(String username, String password) {

		if (username.equals("elon") && password.equals("twitter")) {
			System.out.println("Twitter Login Successful");
		} else {
			System.out.println("Twitter Login Failed");
		}

	}
}
