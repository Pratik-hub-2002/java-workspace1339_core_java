package saturdays;

public class Fibonacci_Series {

	int terms;

	public Fibonacci_Series(int terms) {
		this.terms = terms;
	}

	public void fibonacciSeries() {

		int first = 0, second = 1, next;

		for (int i = 1; i <= terms; i++) {

			System.out.println(first + " ");

			next = first + second;
			first = second;
			second = next;
		}
	}
}
