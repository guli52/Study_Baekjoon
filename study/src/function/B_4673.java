package function;



public class B_4673 {

	public static void main(String[] args) {
		d arr = new d();
		int[] n = new int[10000];
		int a = 0;

		for(int i=0; i<n.length; i++) {
			n[i] = i+1;
			a = arr.dn(n);
			System.out.println(a);
		}
		
	}
 
}
