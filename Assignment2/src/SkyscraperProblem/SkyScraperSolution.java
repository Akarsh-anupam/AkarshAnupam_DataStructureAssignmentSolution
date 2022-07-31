package SkyscraperProblem;

import java.util.ArrayList;
import java.util.HashSet;

public class SkyScraperSolution {
	
	public static void ShowDailyConstructionWork(ArrayList<Integer> floors, int floorSize)
	{
		HashSet<Integer> floorSet = new HashSet<Integer>();
		
		for(int i=0;i<floors.size();i++)
		{
			floorSet.add(floors.get(i));
			System.out.println("\nDay " + (i+1) + ": ");
			if(floors.get(i) == floorSize)
			{
				floorSize = FindNextMaxInSet(floorSet, floorSize);
			}
		}
	}
	
	private static int FindNextMaxInSet(HashSet<Integer> floorSet, int max)
	{
		while(true)
		{
			if(floorSet.contains(max))
			{
				floorSet.remove(max);
				System.out.print(max + " ");
				max-=1;
			}
			else
				break;
		}
		return max;
	}
}
