package movementsystem;

import java.util.ArrayList;

public class questDatabase {
	public static ArrayList<quest> questData = new ArrayList<>() ;
	
	public static void setupQuests()
	{
		questData.clear();
		questData.add(new quest(0,1001,1,"Check Manor Basement","Come on",1));
		questData.add(new quest(1,5,1,"Check on erina","Come on",2));
		questData.add(new quest(2,6,1, "Fight Erina","Kill her",-1));
		
	}
	public static quest getQuest(int id)
	{
		for(int i = 0; i < questData.size();i++)
		{
			if(questData.get(i).questID== id)
			{
				return questData.get(i);
			}
		}
		return null;
	}
}
