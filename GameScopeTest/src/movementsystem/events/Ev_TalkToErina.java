package movementsystem.events;

import movementsystem.EventGui;
import movementsystem.event;
import movementsystem.partyData;
import movementsystem.questDatabase;

public class Ev_TalkToErina extends event {

	public Ev_TalkToErina() {
		name = "Talk to Erina";
	}

	@Override
	public int happen(partyData party) {
		if(party.isquestOngoing(0))
		{
			EventGui.sendmsg("Erina told you to check basement a moment ago");
			return 0;
		}
		else if(party.isquestOngoing(1))
		{
			EventGui.sendmsg("Erina thanked you and started to transform");
			party.progressQuest(5);
			party.location.buttonevents[1] = 7;
			return 0;
		}
		else if(party.isquestOngoing(2))
		{
			return 0;
		}
		else if(party.isquestComplete(2)) 
		{
			EventGui.sendmsg("Erina seems busy");
			return 0;
		}
		EventGui.sendmsg("Erina told you to check basement");
		party.addNewQuest(questDatabase.getQuest(0));
		return 0;
	}

}
