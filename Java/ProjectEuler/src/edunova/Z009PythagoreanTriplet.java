package edunova;



public class Z009PythagoreanTriplet {
	public static void main(String[] args) {
//		There exists exactly one Pythagorean triplet for which a + b + c = 1000.
//		Find the product abc.


		int triplet = 0;
		vanjska: for (int a = 1, b = 2, c = 3; c < 1000; a++, b++, c++) {
			for (int drugi = b; drugi > 0; drugi--) {
				for (int treci = a; treci > 0; treci--) {
					if ((treci * treci) + (drugi * drugi) != (c * c)) {
						continue;
					} else {
						triplet = treci + drugi + c;
						if (triplet == 1000) {
							System.out.println(treci + " " + drugi + " " + c + " " + triplet);
							break vanjska;
						}

					}

				}
			}
		}

	}

}
