package abstraction;

public class Insta implements SocialMedia {

	@Override
	public void login(String username, String password) {

		if (username.equals("admin") && password.equals("9876")) {
			System.out.println("Instagram Login Successful");
		} else {
			System.out.println("Instagram Login Failed");
		}

	}
}
