import java.util.*;
public class PrimeFactorsTestDrive {

	public static void main(String[] args) {
		Helper helper = new Helper();
		int number = Integer.parseInt(helper.getUserInput("Give me a number: "));
		PrimeFactors pf = new PrimeFactors();
		ArrayList<Integer> results = pf.generate(number);
		System.out.println("The prime factors are: " + results);
	}
}