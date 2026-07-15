package methods;

public class Password_Strength_Checker {

	public String checkPassword(String check_password) {

		if (check_password.length() >= 8 && check_password.contains("@")) {
			return "Strong Password";
		}
		return "Weak Password";
	}
}
