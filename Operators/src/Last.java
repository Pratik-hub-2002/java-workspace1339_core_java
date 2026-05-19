
public class Last {

	public static void main(String[] args) {

		System.out.println(Integer.toBinaryString(5)); //101
		System.out.println(~37); // -(37+1) = -38
		System.out.println(3 >> 6); // 0
		System.out.println(18 << 1); // 36
		System.out.println(~7); // -(7+1) = -8
		System.out.println(~(2 ^ 2)); // (~0) = -(0+1) = -1
		System.out.println(127 ^ 12); // 115
		System.out.println(23 >> 7); // 0
		System.out.println(~3 >> 7); // (-4 >> 7) = -1
		System.out.println(~11 << 2); // (-12 << 2) = -48
		System.out.println(~(12 & 3)); // (~0) = -(0+1) = -1
	}
}
