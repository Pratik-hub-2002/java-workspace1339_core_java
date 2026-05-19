
public class Day1 {

	double a = 1005456.1;
	int b= 453465965;
	float c = 5454551.4f;
	
	
	public static void main(String[] args) {
		
		Day1 d = new Day1();
		System.out.println("\n======================Arithmetic Operators===============");
		System.out.println("\nAddition of "+d.a+ " + " +d.b+  " + " +d.c+ " = " + (d.a+d.b+d.c));
		System.out.println("\nSubstraction of "+d.a+ " - " +d.b+  " - " +d.c+ " = " + (d.a-d.b-d.c));
		System.out.println("\nMultiplication of "+d.a+ " * " +d.b+  " * " +d.c+ " = " + (d.a*d.b*d.c));
		System.out.println("\nDivision of "+d.a+ " / " +d.b+  " / " +d.c+ " = " + (d.a/d.b/d.c));
		System.out.println("\nModulus of "+d.a+ " % " +d.b+  " % " +d.c+ " = " + (d.a%d.b%d.c));
	}
	
}
