package movementsystem.events;

import movementsystem.EventGui;
import movementsystem.arealist;
import movementsystem.event;
import movementsystem.partyData;

public class Ev_BattleStart extends event {

	@Override
	public int happen(partyData party) {
		EventGui.sendmsg("Battle has begun");
		return 5;
	}

}
