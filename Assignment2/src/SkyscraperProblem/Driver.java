package SkyscraperProblem;

import java.util.ArrayList;
import java.util.Scanner;


public class Driver {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int floorsize;
		ArrayList<Integer> floors = new ArrayList<Integer>();
		System.out.println("Enter the total no of floors in the building");
		floorsize = sc.nextInt();
		for(int i=0;i<floorsize;i++) 
		{
			System.out.println("enter the floor size given on day : " + (i+1));
			floors.add(sc.nextInt());
		}
		System.out.println("The order of construction is as follows: ");
		SkyScraperSolution.ShowDailyConstructionWork(floors, floorsize);
		sc.close();
	}

}
