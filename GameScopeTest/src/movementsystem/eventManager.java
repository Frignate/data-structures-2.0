package movementsystem;

import java.util.ArrayList;

public class eventManager {
	public eventDatabase masterDatabase;
	public partyData party;
	public void eventStart(int id)
	{
		var eventid = id;
		while (eventid != 0)
		{
			eventid = masterDatabase.get(eventid).happen(party);
		}
	}

	public eventManager(eventDatabase masterDatabase) {
		this.masterDatabase = masterDatabase;
		this.party = new partyData();
	}
}
