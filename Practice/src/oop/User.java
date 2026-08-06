package oop;

public abstract class User {

	protected String uname;
	protected long mob_no;

	User(String uname, long mob_no) {
		this.mob_no = mob_no;
		this.uname = uname;
	}

	public abstract void role();
}
