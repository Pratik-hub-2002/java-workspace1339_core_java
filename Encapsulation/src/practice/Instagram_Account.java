package practice;

public class Instagram_Account {
	private String username;
	private String password;

	public Instagram_Account(String username, String password) {
		this.username = username;
		this.password = password;
	}


	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}


	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		if (password.length() >= 8) {
			this.password = password;
		} else {
			System.out.println("Password must contain at least 8 characters.");
		}
	}
}
