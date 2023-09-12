package com.sgtesting.encapsu;
class Desktop
{
	String DesktopName;
	String Processor;
	String MemoryRAM;
	String Storage;
	String CountryOfOrigin;		
}
class Laptop
{
	String LaptopName;
	String Processor;
	String MemoryRAM;
	String Storage;
	String CountryOfOrigin; 
}
class Mobile
{
	String MobileName;
	String Processor;
	String MemoryRAM;
	String Storage;
	String CountryOfOrigin;
}


public class DesktopLaptopMobile
{

	public static void main(String[] args)
	{
		System.out.println("DESKTOP");
		Desktop D=new Desktop();

		D.DesktopName="LENOVO";
		D.Processor="Up to 11th Gen Intel® Core™ i7";
		D.MemoryRAM="Up to 16 GB 3200MHz";
		D.Storage="256 GB PCIe SSD AND 1 TB HDD";
		D.CountryOfOrigin="CHINA";

		System.out.println("NAME OF THE DESKTOP:---"+D.DesktopName);
		System.out.println("NAME OF THE PROCESSOR:-"+D.Processor);
		System.out.println("RAM MEMORY CAPACITY:---"+D.MemoryRAM);
		System.out.println("STORAGE CAPACITY:------"+D.Storage);
		System.out.println("COUNTRY OF ORIGIN:-----"+D.CountryOfOrigin);
		System.out.println("==================================");

		System.out.println("MOBILE");
		Mobile M=new Mobile();

		M.MobileName="SAMSUNG GALAXY M14";
		M.Processor="Exynos 1330, Octa Core, 2.4 GHz Processor";
		M.MemoryRAM="6 GB RAM";
		M.Storage="128 GB";
		M.CountryOfOrigin="SOUTH KOREA";

		System.out.println("NAME OF THE MOBILE:-----"+M.MobileName);
		System.out.println("NAME OF THE PROCESSOR:--"+M.Processor);
		System.out.println("RAM MEMORY CAPACITY:----"+M.MemoryRAM);
		System.out.println("STORAGE CAPACITY:-------"+M.Storage);
		System.out.println("COUNTRY OF ORIGIN:------"+M.CountryOfOrigin);
		System.out.println("==================================");

		System.out.println("LAPTOP");
		Laptop L=new Laptop();

		L.LaptopName="DELL INSPIRON";
		L.Processor="AMD APU Quad Core A6 7th Gen 7300HQ";
		L.MemoryRAM="8 GB RAM";
		L.Storage="1TB HARD DISK";
		L.CountryOfOrigin="U S A";

		System.out.println("NAME OF THE LAPTOP:-----"+L.LaptopName);
		System.out.println("NAME OF THE PROCESSOR:--"+L.Processor);
		System.out.println("RAM MEMORY CAPACITY:----"+L.MemoryRAM);
		System.out.println("STORAGE CAPACITY:-------"+L.Storage);
		System.out.println("COUNTRY OF ORIGIN:------"+L.CountryOfOrigin);
		System.out.println("==================================");

	}

}
