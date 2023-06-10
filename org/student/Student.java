package org.student;

import org.department.Department;

public class Student extends Department {
public void studentname() {
	System.out.println("Student name is Muthulakshmi");
}
public void studentid() {
	System.out.println("Student id is 6611");
}
public void studentdept() {
	System.out.println("Muthulakshmi belongs to IT department");
}
public static void main(String[] args) {
	Student s=new Student();
	s.clgcode();
	s.clgname();s.clgrank();
	s.It();
	s.Mech();
	s.ECE();
	s.studentname();
	s.studentid();
	s.studentdept();
}
}
