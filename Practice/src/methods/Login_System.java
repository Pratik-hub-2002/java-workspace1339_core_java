package methods;

public class Login_System {

	public boolean login(String username, String password) {

		if (username.equals("admin") && password.equals("1234")) {
			return true;
		}
		return false;

	}
}
