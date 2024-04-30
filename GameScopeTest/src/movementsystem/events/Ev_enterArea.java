package movementsystem.events;

import movementsystem.EventGui;
import movementsystem.arealist;
import movementsystem.event;
import movementsystem.partyData;

public class Ev_enterArea extends event {
	
	int areaid=-1;
	public Ev_enterArea(int id) {
		areaid = id;
		name = "Enter:"+arealist.arealist.get(areaid%1000).Name;
	}

	@Override
	public int happen(partyData party) {
		EventGui.sendmsg("Moved to :"+ arealist.arealist.get(areaid%1000).Name);
		party.location = arealist.arealist.get(areaid%1000);
		party.progressQuest(areaid);
		return 0;
	}

}
