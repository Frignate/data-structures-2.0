package movementsystem;

import java.util.ArrayList;

import battleSystem.*;

public class area {
	public String id;
	public String Name;
	public ArrayList<Character> encounterlist;
	public ArrayList<event> events;
	
	public area(String id, String name) {
		super();
		this.id = id;
		Name = name;
	}
	
}
