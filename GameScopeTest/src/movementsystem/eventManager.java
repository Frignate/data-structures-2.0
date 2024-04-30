package movementsystem;

public class eventManager {
	public eventDatabase masterDatabase;
	public partyData party;
	public int nextevent = 0;
	public void eventStart(int id)
	{
		var eventid = id;
		nextevent = masterDatabase.get(eventid).happen(party);
	}
	
	public eventManager(eventDatabase masterDatabase) {
		this.masterDatabase = masterDatabase;
		masterDatabase.setupEvents();
		this.party = new partyData();
	}
}
