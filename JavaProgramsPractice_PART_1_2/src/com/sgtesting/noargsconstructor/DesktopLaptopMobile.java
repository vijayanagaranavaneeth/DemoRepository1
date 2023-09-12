package com.sgtesting.noargsconstructor;


class Desktop
{
	String DesktopName;
	String Processor;
	String MemoryRAM;
	String Storage;
	String CountryOfOrigin;	
	Desktop()
	{
		DesktopName="LENOVO";
		Processor="Up to 11th Gen Intel® Core™ i7";
		MemoryRAM="Up to 16 GB 3200MHz";
		Storage="256 GB PCIe SSD AND 1 TB HDD";
		CountryOfOrigin="CHINA";

		System.out.println("NAME OF THE DESKTOP:---"+DesktopName);
		System.out.println("NAME OF THE PROCESSOR:-"+Processor);
		System.out.println("RAM MEMORY CAPACITY:---"+MemoryRAM);
		System.out.println("STORAGE CAPACITY:------"+Storage);
		System.out.println("COUNTRY OF ORIGIN:-----"+CountryOfOrigin);
		System.out.println("==================================");
	}
}

class Laptop
{
	String LaptopName;
	String Processor;
	String MemoryRAM;
	String Storage;
	String CountryOfOrigin;
	Laptop()
	{
		LaptopName="DELL INSPIRON";
		Processor="AMD APU Quad Core A6 7th Gen 7300HQ";
		MemoryRAM="8 GB RAM";
		Storage="1TB HARD DISK";
		CountryOfOrigin="U S A";

		System.out.println("NAME OF THE LAPTOP:-----"+LaptopName);
		System.out.println("NAME OF THE PROCESSOR:--"+Processor);
		System.out.println("RAM MEMORY CAPACITY:----"+MemoryRAM);
		System.out.println("STORAGE CAPACITY:-------"+Storage);
		System.out.println("COUNTRY OF ORIGIN:------"+CountryOfOrigin);
		System.out.println("==================================");
	}

}
class Mobile
{
	String MobileName;
	String Processor;
	String MemoryRAM;
	String Storage;
	String CountryOfOrigin;
	Mobile()
	{
		MobileName="SAMSUNG GALAXY M14";
		Processor="Exynos 1330, Octa Core, 2.4 GHz Processor";
		MemoryRAM="6 GB RAM";
		Storage="128 GB";
		CountryOfOrigin="SOUTH KOREA";

		System.out.println("NAME OF THE MOBILE:-----"+MobileName);
		System.out.println("NAME OF THE PROCESSOR:--"+Processor);
		System.out.println("RAM MEMORY CAPACITY:----"+MemoryRAM);
		System.out.println("STORAGE CAPACITY:-------"+Storage);
		System.out.println("COUNTRY OF ORIGIN:------"+CountryOfOrigin);
		System.out.println("==================================");
	}
}

public class DesktopLaptopMobile 
{

	public static void main(String[] args)
	{
		System.out.println("DESKTOP");
		Desktop D=new Desktop();
		System.out.println("MOBILE");
		Mobile M=new Mobile();
		System.out.println("LAPTOP");
		Laptop L=new Laptop();

	}

}
