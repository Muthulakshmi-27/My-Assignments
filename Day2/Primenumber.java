package weeek1.Day2;

public class Primenumber {

	public static void main(String[] args) {
		int n= 13;
		boolean flag;
		flag=false;
		int m=n/2;
		for (int i=2;i<=m; i++) {
			if (n%i==0)
			{
				flag=true;
				System.out.println("This number is not prime number");
				break;
			}
			
		}
		if(flag==false) {
			
			System.out.println("This number is prime number");
		}
	
		
	
	
	}

}
