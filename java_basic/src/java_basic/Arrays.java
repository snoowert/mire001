package java_basic;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[10];
		
		for(int i = 0; i < a.length; i++) {
			a[i] = i+1;
		}
		for(int i = 0; i< a.length; i++)
			System.out.println(a[i]);
	}

}
