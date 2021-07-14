package test;

public class Test3 {

	public static void main(String[] args) {
		// 3개의 리스트에서 중복 된 값 찾기
		
		int[] a = {1, 3, 5, 7, 9, 13};
		int[] b = {3, 4, 5, 9, 13};
		int[] c = {1, 4, 5, 10, 13};
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<b.length; j++) {
				if(a[i]==b[j]) {
					for(int k=0; k<c.length; k++) {
						if(a[i]==c[k]) {
							System.out.print(a[i] + " ");
						}
					}
				}
			}
		}

	}

}
