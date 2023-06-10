package week3assignments;

public class Desktop extends Computer {
	public void Desktopsize() {
		System.out.println("HP Size 11inch");
	}
	public void Desktopsize1() {
		System.out.println("Dell Size 15inch");
	}

	public static void main(String[] args) {
		Desktop c=new Desktop();
		c.Dell();
		c.HP();
		c.Desktopsize();
		c.Desktopsize1();
	}
}
