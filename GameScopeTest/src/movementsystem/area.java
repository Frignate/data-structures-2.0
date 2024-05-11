package movementsystem;

public class area {
	public int id;
	public String Name;
	public int[] buttonevents = new int[4];
	public area(int id, String name, int[] buttonevents) {
		super();
		this.id = id;
		Name = name;
		this.buttonevents = buttonevents;
	}
	public static void newarea(String name, int[] buttonevents) {
		area newArea = new area(1000 + arealist.arealist.size(), name, buttonevents);
		arealist.arealist.add(newArea);
	}
}
