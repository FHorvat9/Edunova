package edunova;

public class E03OmotaciPrimitivnihTipova {
	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE+1);
		int i = Integer.parseInt("3t");
		System.out.println(i);
		
		boolean x = Boolean.parseBoolean("True");
		short s = Short.parseShort("12");
		byte b = Byte.parseByte("23");
		long l = Long.parseLong("2424");
		double d = Double.parseDouble("44");
		float f = Float.parseFloat("3.12");
		char c = Character.valueOf('Z');
	}

}
