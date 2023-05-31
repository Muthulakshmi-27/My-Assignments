package weeek1.Day2;

public class Duplicatearray {

	public static void main(String[] args) {
		int n[]= {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int l=n.length;
		int count;
		
		for (int i = 0; i < n.length-1; i++) {
			count=0;
			for (int j = 0; j < i; j++) {
				
				if(n[i]==n[j]) {
					System.out.println("Duplicate numbers in array " +n[i]);
				}
			}
			
			
		}
	}

}
