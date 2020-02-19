package Practise;

public class ReverseString {

	public static void main(String[] args) {
		String me = "hello";
		String reverse = "";
		for (int i = 0; i< me.length(); i++) {
			reverse = me.charAt(i) + reverse;
		}

		System.out.println(reverse);
		
		//second method
		int length = me.length();
		StringBuilder build = new StringBuilder();
		for(int i = length -1; i >= 0; i--) {
			build.append(me.charAt(i));
		}
		String result = build.toString();
		System.out.println(result);
		
		//third method
		StringBuilder build2 = new StringBuilder(me);
		build2.reverse();
		String rev = build2.toString();
		System.out.println(rev);
		
	}

}
