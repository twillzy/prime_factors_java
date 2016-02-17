import java.util.*;
public class PrimeFactors {

	public boolean isPrime(int n) {
		boolean isPrime = true;
		int i = 2;
		while (isPrime && i < n) {
			if (n % i == 0) {
				isPrime = false;
			}
			i++;
		}
		return isPrime;
	}

	public ArrayList<Integer> generate(int n) {
		PrimeFactors pf = new PrimeFactors();
		ArrayList<Integer> results = new ArrayList<Integer>();
		if (pf.isPrime(n)) {
			return results;
		} else {
			int i = 2;
			while (i < n) {
				if (n % i == 0 && pf.isPrime(i)) {
					results.add(i);
				}
				i++;
			}
			return results;
		}
	}
}