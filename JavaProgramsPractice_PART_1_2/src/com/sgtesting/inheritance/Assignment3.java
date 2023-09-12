package com.sgtesting.inheritance;
class Student5{
	void civil(String fn,int Rollno, String location) {
		System.out.println("Name of the Student :" +fn);
		System.out.println("University Number of the Student :" +Rollno);
		System.out.println("Native Place of the student :" +location);
	}
}

class Staff2 extends Student5{
	void mechanical(int noofstaff) {
		System.out.println("Number of Staff :" +noofstaff);
	}
}

class nonstaffmem extends Staff2{
	void college(int noofnonstaff) {
		System.out.println("Number of Non teaching staff :"+noofnonstaff);
	}
}
class officestaff extends Student{
	void office(int officestaff) {
		System.out.println("Number of Office staff :" +officestaff);
	}
}

public class Assignment3 {

	public static void main(String[] args) 
	{
		nonstaffmem o2 = new nonstaffmem();
		o2.college(32);
		o2.civil("mohith", 45, "bengalore");
		o2.mechanical(34);
		officestaff o1 = new officestaff();
		o1.civil("Mohith", 23, "Mysore");
		o1.office(60);



	}

}
