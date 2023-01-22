package edunova;



public class Z010SummationOfPrimes {
	public static void main(String[] args) {
//		 Find the sum of all the primes below two million.
		long zbroj=0;
		for (int i = 0; i < 2000000; i++) {
			
			if (isPrim(i)) {
				zbroj+=i;
			}
		}
		
		System.out.println(zbroj);
		System.out.println("142913828922");
	}

	public static boolean isPrim(int unos) {
		if (unos == 0) {
			return false;
		}

		for (int i = 2; i <= Math.sqrt(unos); i++) {
			if (unos % i == 0) {
				return false;
			}

		}
		return true;
	}

}
