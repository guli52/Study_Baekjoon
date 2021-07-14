package function;

public class d {
		int dn(int[] n) {
			int a = 0;
			int c = 0;
			for(int i=0; i<n.length; i++) {
				if((n[i]<10) && (n[i]%2!=0)) {
					a = n[i];
				}
				if(n[i]==20+c) {
					a = n[i];
					c+=11;
				}
			}
			return a;
		}
}
