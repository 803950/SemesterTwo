//© A+ Computer Science
// www.apluscompsci.com

//sort example using an array of Comparable

import static java.lang.System.*;
import java.util.Arrays;

public class Sort
{
	public static void main ( String[] args )
	{
		Comparable[] creatureList = new Creature[3];
		Creature creature1 = new Creature(100);
		creatureList[0] = creature1;
		Creature creature2 = new Creature(4);
		creatureList[1] = creature2;
		Creature creature3 = new Creature(16);
		creatureList[2] = creature3;
		
		Arrays.sort(creatureList);	
		
		for(Comparable it : creatureList)
		{
			out.println(it);
		}		
  }
}