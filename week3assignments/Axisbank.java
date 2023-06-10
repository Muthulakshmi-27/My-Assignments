package week3assignments;

public class Axisbank extends Bankinfo {
	public void deposit() {
		System.out.println("Maximum deposit per day is 1000");
	}

	public static void main(String[] args) {
		Axisbank a=new Axisbank();
		a.fixed();
		a.deposit();
		a.saving();
	}
}
