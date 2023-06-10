package week3assignments;

public class Automation extends Multiplelang{

	public void selenium() {
		System.out.println("Selenium used for webapplication automation");
		
	}

	@Override
	public void Ruby() {
		System.out.println("We can use Ruby also in automation");
		
	}
public static void main(String[] args) {
	Automation a=new Automation();
	a.selenium();
	a.python();
	a.Ruby();
	
}
	

}
