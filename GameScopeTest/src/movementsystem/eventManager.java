package movementsystem;

import java.util.ArrayList;

public class eventManager {
	public ArrayList<event> masterDatabase;
	public partyData party;
	public void eventStart(int id)
	{
		var eventid = id;
		while (eventid != -1)
		{
			for (event event : masterDatabase) {
				if(event.id == eventid)
				{
					eventid = event.happen(party);
				}
			}
		}
	}
	public eventManager(ArrayList<event> masterDatabase, partyData party) {
		super();
		this.masterDatabase = masterDatabase;
		this.party = party;
	}
}
