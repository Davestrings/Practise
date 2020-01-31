package Practise;

public class Hypotenuse {

	public static void main(String[] args) {
		System.out.println(hypotenuse(3.0, 4.0));
		System.out.println(hypotenuse(5.0, 12.0));
		System.out.println(hypotenuse(8.0, 15.0));

	}
	public static double hypotenuse(double side1, double side2) {
		double side3sq = Math.pow(side1, 2) + Math.pow(side2, 2);
		double side3 = Math.sqrt(side3sq);
		return side3;
	}

}
