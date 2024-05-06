package movementsystem;

import java.util.ArrayList;

import movementsystem.areas.Manor;
import movementsystem.areas.manorBasement;

public class arealist {
	public static ArrayList<area> arealist = new ArrayList<>();
	static void setupAreas()
	{
		arealist.add(new Manor());
		arealist.add(new manorBasement());//comment here
	}

}
