
public class Logic {

	public static void main(String[] args) {

		int a = 1;
		System.out.println(!(23 > 56) && true || 45 != 42 && a > 2 && !((45 > 56) || !(45 <= 44)));
		System.out.println((3 > 6) && !(true) && 45 == 2 || !(a > 2) && !((45 > 56) || !(45 <= 44)));
		System.out.println(!(23 > 56) && true || !(45 != 42) && a > 2 && !((true) && (45 <= 44)));
		System.out.println(!(23 > 56) && true || false && a > 2 && !(!(45 > 56) || (45 <= 44)));
		System.out.println(!(23 > 56) && false || 45 != 42 && true && !((45 > 56) || !(23 > 100) && !(false)));
	}
}
