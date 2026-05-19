
public class Inc_Dec {

	public static void main(String[] args) {

		int a = 4; 
		System.out.println(a + 9); //13
		int i = 12 + a; // 16
		System.out.println((a /= 2)); // 2
		a %= 4; // 1
		a++; // 3
		i++; // 17
		System.out.println(i %= 2); // 1
		i++; // 2
		System.out.println(a + i); // 5
		--a; // 2
		System.out.println(a += i); // 4
		a++; // 5
		--i; // 1
		System.out.println(a); // 5
		a += 45; // 50
		System.out.println(i); // 1
		System.out.println(a + 1); // 51
		a /= 2; // 25
		System.out.println(a); // 25

	}

}
