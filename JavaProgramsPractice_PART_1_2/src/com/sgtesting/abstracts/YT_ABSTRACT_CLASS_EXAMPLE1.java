package com.sgtesting.abstracts;
abstract class animal
{
	animal()
	{
		System.out.println("ALL ANIMALS......!");
	}
	abstract void sound();
}
class Dog extends animal
{
	Dog()
	{
		super();
	}
    void sound()
    {
    	System.out.println("Dog is Barking");
    }
}
class Lion
{
	Lion()
	{
		super();
	}
	void sound()
	{
		System.out.println("Lion is Roaring");
	}
}
public class YT_ABSTRACT_CLASS_EXAMPLE1 
{

	public static void main(String[] args) 
	{
		Dog d=new Dog();
		Lion l=new Lion();
		d.sound();
		l.sound();
		
	}

}
