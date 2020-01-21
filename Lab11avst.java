// Lab11avst.java
// The "Sieve of Eratosthenes" Program
// This is the student, starting version of the Lab11a assignment.


import java.util.Scanner;


public class Lab11avst
{
	public static void main(String[] args)
	{
		// This main method needs additions for the 100 point version.
		Scanner input = new Scanner(System.in);
		final int MAX = 100;
		boolean primes[];
		primes = new boolean[MAX];

		for(int index = 2; index < primes.length; index++){
			primes[index] = true;
		}


		computePrimes(primes);
		displayPrimes(primes);
	}

	public static void computePrimes(boolean primes[])
	{
		System.out.println("\nCOMPUTING PRIME NUMBERS");
		for(int index = 2; index < primes.length; index++){
			for(int k= (index +1); k< primes.length; k++){
				if (primes[k]==true){
					int remainder = k%index;
					if (remainder == 0){
						primes[k] = false;
					}
				}
			}
		}
	}

	public static void displayPrimes(boolean primes[])
	{
		System.out.println("\n\nPRIMES BETWEEN 1 AND "+ primes.length);
		System.out.println();
		for(int index = 2; index < primes.length; index ++){
			if (primes[index] == true){
					System.out.print(index + " ");
			}
		}
	}

}
