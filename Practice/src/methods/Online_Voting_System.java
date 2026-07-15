package methods;

public class Online_Voting_System {

	public boolean vote(int age) {

		if (age >= 18) {
			return true;
		}
		return false;
	}
}
