package practice;

public class Login_System {

	private String lemail;
	private String lpassword;

	public Login_System(String lemail, String lpassword) {

		this.lemail = lemail;
		this.lpassword = lpassword;
	}

	public void setEmail(String lemail) {
		this.lemail = lemail;
	}

	public void setPassword(String lpassword) {
		this.lpassword = lpassword;
	}

	public String getEmail() {
		return lemail;
	}

	public String getPassword() {
		return lpassword;
	}

	public boolean checkLogin() {

		if (!lemail.contains("@") || !lemail.contains(".")) {
			System.out.println("Invalid Email!");
			return false;
		}

		if (lpassword.length() < 8) {
			System.out.println("Password must contain at least 8 characters.");
			return false;
		}
		System.out.println("Login Successful.");
		return true;
	}
}
