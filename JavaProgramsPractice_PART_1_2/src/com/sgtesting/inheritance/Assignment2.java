package com.sgtesting.inheritance;
class Student{
	void civil(String fn,int Rollno, String location) {
		System.out.println("Name of the Student :" +fn);
		System.out.println("University Number of the Student :" +Rollno);
		System.out.println("Native Place of the student :" +location);
	}
}

class Staff extends Student{
	void mechanical(int noofstaff) {
		System.out.println("Number of Staff :" +noofstaff);
	}
}

class nonstaff extends Student{
	void college(int noofnonstaff) {
		System.out.println("Number of Non teaching staff :"+noofnonstaff);
	}
}

public class Assignment2 {

	public static void main(String[] args) 
	{
		Staff o1 = new Staff();
		o1.civil("Santosh", 12, "Mysore");
		o1.mechanical(100);
		nonstaff o2 = new nonstaff();
		o2.college(32);
		o2.civil("Navaneeth", 12, "Bengalore");


	}

}
