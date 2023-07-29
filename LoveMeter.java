package Love;

import java.util.Scanner;

public class LoveMeter {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome To The Love Meter");
		System.out.println("Enter Your Name");
		String name1=sc.nextLine();
		
		System.out.println("Enter Your Partners Name");
		String name2=sc.nextLine();
		
		int compatibility =calculateCompatibility(name1,name2);
		System.out.println("Calculating The Compatibility...");
		System.out.println(name1+" and "+ name2 +" are "+ compatibility +"%compatible!");
		
		
	}
	public static int calculateCompatibility(String name1,String name2)
	{
		String combinedNames=(name1+name2).toLowerCase();
		int loveScore=0;
		for(int i=0; i<combinedNames.length(); i++)
		{
			char c=combinedNames.charAt(i);
			loveScore=loveScore+c;
			
		}
		int compatibility =loveScore%101;
		
		return compatibility;
		
	}

}
