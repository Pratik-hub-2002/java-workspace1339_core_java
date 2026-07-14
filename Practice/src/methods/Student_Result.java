package methods;

public class Student_Result {

	public double calculatePercentage(int dsa, int cloud, int devops, int javaMarks) {
		
		int total = dsa + cloud + devops + javaMarks;
		double percentage = total /4.0;
		return percentage;
	}
}
