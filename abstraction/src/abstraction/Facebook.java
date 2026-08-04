package abstraction;

public class Facebook implements SocialMedia {

	@Override
	public void login(String username, String password) {

		if (username.equals("ram") && password.equals("12345")) {
			System.out.println("Facebook Login Successful");
		} else {
			System.out.println("Facebook Login Failed");
		}

	}
}
