package week3assignments;

public class Students {
public void Studentinfo(int b) {
	System.out.println(b);
}
public void Studentinfo(int d,String c) {
	System.out.println(c);
	System.out.println(d);
}
public static void main(String[] args) {
	Students s=new Students();
s.Studentinfo(6611);
s.Studentinfo(456790, "lachu6261@gmail.com");

}

}