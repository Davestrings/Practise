package Practise;

public class Triangle {

	public static void main(String[] args) {
		
		//first triangle
		
		for(int i=1; i<=10;i++) {
			for(int j=10; j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//Second triangle
		
		for(int k=1;k<=10;k++) {
			for(int l=1;l<=k;l++) {
				System.out.print(" ");
			}
			for(int m=k;m<=10;m++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//Joining the triangles together
		
		for(int i=1; i<=10;i++) {
			for(int j=10;j>i;j--) {
				System.out.print("*");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("  ");
			}
			for(int l=i;l<10;l++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
