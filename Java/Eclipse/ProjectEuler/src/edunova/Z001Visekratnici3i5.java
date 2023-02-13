package edunova;



public class Z001Visekratnici3i5 {
	public static void main(String[] args) {
		
//		Find the sum of all the multiples of 3 or 5 below 1000.
		
		int zbroj =0;
		
		
		for(int i=1;i<1000;i++) {
			if(i%3==0 || i%5==0) {
				zbroj += i;
				}
		}
		System.out.println(zbroj);
		
	}

}
