package weeek1.Day2;

import java.util.Arrays;

public class Missingelement {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,7,6,8};
  Arrays.sort(a);
	 int l=a.length;
	for (int i =1; i<=l;i++) {
		if(i!=a[i-1]) {
			System.out.println(i);
			break;
		}
	
		
	}
		
		

	}

}
