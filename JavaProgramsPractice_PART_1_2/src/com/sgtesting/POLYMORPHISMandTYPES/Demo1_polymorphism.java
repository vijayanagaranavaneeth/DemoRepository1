package com.sgtesting.POLYMORPHISMandTYPES;
abstract class GeometricFigure
{
	abstract void area();
}
class Square extends GeometricFigure
{
	void area()
	{
		int area=5;
		System.out.println("area of the square:"+area);
	}
}
class rectangle extends GeometricFigure
{
	void area()
	{
		int length,breath;
		length=5;
		breath=15;
		System.out.println("area of rectangle:"+(length*breath));
	}
}
class circle extends GeometricFigure
{
	void area()
	{
		double radius=12.50;
		System.out.println("area of circle:"+(3.14*(radius)*(radius)));
	}
}
public class Demo1_polymorphism 
{

	public static void main(String[] args) 
	{
		GeometricFigure figure=null;
		Square sq=new Square();
		rectangle rect=new rectangle();
		circle ci=new circle();

		figure =sq;
		figure.area();

		figure =rect;
		figure .area();

		figure =ci;
		figure .area();


	}

}
