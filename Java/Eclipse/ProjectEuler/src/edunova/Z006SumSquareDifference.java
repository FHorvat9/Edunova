package edunova;



public class Z006SumSquareDifference {
	public static void main(String[] args) {
//		Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

		int zbrojkvadrata = 0, kvadratzbroja = 0, razlika = 0;

		for (int i = 1; i <= 100; i++) {
			zbrojkvadrata += (i * i);
		}

		for (int i = 1; i <= 100; i++) {
			kvadratzbroja += i;
		}
		kvadratzbroja *= kvadratzbroja;

		razlika = kvadratzbroja - zbrojkvadrata;
		System.out.println(razlika);

	}

}
