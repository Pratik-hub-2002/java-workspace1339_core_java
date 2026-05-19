
public class Second {
	int a =10;
	int b= 50;
	int c=a*b;
	int d = a+b;
	int e = a-b;
	int f = b/a;

	public static void main(String[] args) {
		
		Second obj= new Second();
		
		System.out.println("Multiplication = " + obj.c);
		System.out.println("Addition = " + obj.d);
		System.out.println("Substraction = " + obj.e);
		System.out.println("Division = "+ obj.f);
		
		
	}
}
