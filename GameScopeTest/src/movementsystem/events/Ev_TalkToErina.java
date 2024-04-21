package movementsystem.events;

import java.io.Console;

import movementsystem.arealist;
import movementsystem.event;
import movementsystem.partyData;
import movementsystem.quests.mainQuest1;

public class Ev_TalkToErina extends event {

	public Ev_TalkToErina() {
		name = "Talk to Erina";
	}

	@Override
	public int happen(partyData party) {
		if(party.isquestOngoing(1))
		{
			System.out.println("Erina told you to check basement a moment ago");
			return 0;
		}
		else if(party.isquestOngoing(2))
		{
			System.out.println("Erina thanked you and started to transform");
			party.progressQuest(5);
			party.location.buttonevents[1] = 5;
			return 0;
		}
		else if(party.isquestOngoing(3))
		{
			return 0;
		}
		else if(party.isquestComplete(3)) 
		{
			System.out.println("Erina seems busy");
			return 0;
		}
		System.out.println("Erina told you to check basement");
		party.addNewQuest(new mainQuest1());
		return 0;
	}

}
