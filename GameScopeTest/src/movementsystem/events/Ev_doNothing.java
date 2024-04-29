package movementsystem.events;

import movementsystem.EventGui;
import movementsystem.event;
import movementsystem.partyData;

public class Ev_doNothing extends event {
	
	public Ev_doNothing() {
	name = "Do nothing";
	}

	@Override
	public int happen(partyData party) {
		EventGui.sendmsg("Nothing happened");
		return 0;
	}

}
